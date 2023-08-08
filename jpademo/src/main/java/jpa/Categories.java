package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="categories")
@Entity(name="Categories")
public class Categories {
	@Id
	@Column(name = "catcode")
	private String code;
	@Column(name = "catdesc")
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [code=" + code + ", description=" + description + "]";
	}
}
