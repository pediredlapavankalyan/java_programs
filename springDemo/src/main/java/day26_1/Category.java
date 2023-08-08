package day26_1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Scope(scopeName = "prototype")
@Entity
@Table(name = "categories")
public class Category {
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