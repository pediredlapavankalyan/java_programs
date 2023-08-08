package day25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class InsertProduct implements CommandLineRunner {
	@Autowired
	JdbcTemplate jdbcTemplate;
	//1st question
	public void addProduct(String prodname, double price, int qoh, String remarks, String catcode) {
		jdbcTemplate.update("insert into products values(?,?,?,?,?)", prodname, price, qoh, remarks, catcode);
		System.out.println("Added successfully");
	}
	//2nd question
	public void updateProd(String prodname, int prodid) {
		jdbcTemplate.update("UPDATE products SET ProdName=? where ProdId=?;", prodname, prodid);
		System.out.println("changed product name successfully");
	}
	//3rd question
	public void deleteSale(int invno) {
		jdbcTemplate.update("DELETE sales WHERE Invno=?", invno);
		System.out.println("Sale deleted ");
	}
	//4th question
	public void unitsSold(int prodid) {
		var result = jdbcTemplate.queryForRowSet("Select sum(qty) qty from sales where prodid=?", prodid);
		if (result.next()) {
			if (result.getInt(1) != 0)
				System.out.println("total units sold is : " + result.getInt("qty"));
			else
				System.out.println("No sale occured");
		}

	}
	//5th question
	public void avgPrice()
	{
		var list = jdbcTemplate.queryForList("SELECT c.CatDesc,AVG(Price) avg_Price\n"
				+ "from products p JOIN categories c\n"
				+ "ON(p.CatCode=c.CatCode)\n"
				+ "GROUP by c.CatDesc");
		for(var d:list)
			System.out.println(d);
	}
	//6th question
	public void incPrice(int prod1,int prod2)
	{
		jdbcTemplate.update("update products set price=price*1.10 where prodid=?", prod1);
		System.out.println("product price increased");
		jdbcTemplate.update("update products set price=price*0.90 where prodid=?", prod2);
		System.out.println("product price decreased");
	}
	@Override
	public void run(String... args) throws Exception {
		// addProduct("car", 100000, 1, null, "cat007");
		// updateProd("car", 358);
		// deleteSale(7);
		// unitsSold(340);
		//avgPrice();
		incPrice(341,340);
	}
}
