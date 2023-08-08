package jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "jpql.Product")
@Table(name = "products")
//@javax.persistence.NamedQuery(name = "ProductDetails", query = "  from jpql.Product  where prodid=(select prodid from jpql.Sales group by prodid having sum(amount)>10000")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prodid;
	private String prodName;
	private double price;
	private int qoh;
	private String remarks;
	@ManyToOne
	@JoinColumn(name = "catcode")
	Category category;
	
	@OneToMany(mappedBy = "product")
	private List<Sales> sales= new ArrayList<Sales>();
	public int getProd_id() {
		return prodid;
	}
	public void setProd_id(int prod_id) {
		this.prodid = prod_id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [prod_id=" + prodid + ", prodName=" + prodName + ", price=" + price + ", qoh=" + qoh
				+ ", category=" + category + ", sales=" + sales + "]";
	}
	

}
