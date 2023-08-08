package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "customers") // Specifies the primary table for the annotated entity.
@Entity(name = "customer") // Specifies that the class is an entity. This annotation is applied to the
							// entity class.
public class Customer {
	@Id // Specifies primary key of the entity
	@Column(name = "name") // Specifies the mapped column
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private String mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(mobile) / 2;
	}

	@Override
	public boolean equals(Object obj) {
		Customer c = (Customer) obj;
		return this.mobile.equals(c.mobile);
	}

}
