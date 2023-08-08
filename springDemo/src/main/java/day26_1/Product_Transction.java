package day26_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import jakarta.transaction.Transactional;

@Component
public class Product_Transction  {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Transactional
	public void updatePrice(int p1, int p2) {

		
		TransactionStatus ts = TransactionAspectSupport.currentTransactionStatus();
		System.out.println("Transaction begin");
		int count = jdbcTemplate.update("update products set price=price*1.1 where prodid=?", p1);
		if (count == 0)
		{
			ts.setRollbackOnly();
			System.out.println("failed to update");
			return;
		}
		int count1 = jdbcTemplate.update("update products set price=price*0.9 where prodid=?", p2);
		if (count1 == 0)
		{
			ts.setRollbackOnly();
			System.out.println("failed to update");
		}
		else
			System.out.println("updated successfully");
			
	}
	
}