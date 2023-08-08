package jpa;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SalaryKey implements Serializable {
	@Column(name = "id")
	private int id;
	@Column(name = "month")
	private int month;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		SalaryKey other = (SalaryKey) obj;
		return this.id == other.id && this.month == other.month;
	}

}
