package jpql;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity(name="jpql.sales")
@Table(name="sales")
//@javax.persistence.NamedQuery(name="ProductDetails",query="select product.prodid from jpql.Sales group by prodid having sum(amount)>10000")
public class Sales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invno;
	@Column(name="Transdate")
	private LocalDate date;
	private int Qty;
	private double amount;
	@ManyToOne
	@JoinColumn(name="prodid")
	Product product;
	@Override
	public String toString() {
		return "Sales [invno=" + invno + ", date=" + date + ", Qty=" + Qty + ", amount=" + amount + ", product="
				+ product + "]";
	}
	
}
