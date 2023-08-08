package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "products") // Specifies the primary table for the annotated entity.
@Entity(name = "Products") // Specifies that the class is an entity. This annotation is applied to the
							// entity class.
public class Product {
	@Id // Specifies primary key of the entity
	@Column(name = "ProdId") // Specifies the mapped column
	private int prodId;
	@Column(name = "prodname")
	private String name;
	@Column(name = "price")
	private double price;
	@Column(name = "qoh")
	private String remark;
	@Column(name = "catcode")
	private String catcode;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCatcode() {
		return catcode;
	}

	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", name=" + name + ", price=" + price + ", remark=" + remark + ", catcode="
				+ catcode + "]";
	}

	@Override
	public int hashCode() {
		return this.prodId;
	}

	@Override
	public boolean equals(Object obj) {
		Product p = (Product) obj;
		return this.prodId == p.prodId;
	}

}
