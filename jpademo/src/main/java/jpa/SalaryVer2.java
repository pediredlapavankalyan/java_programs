package jpa;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name = "salaries")
@Entity(name = "jpa.SalaryVer2")
@IdClass(SalaryKey.class)
public class SalaryVer2 {
	@Id
	@Column(name = "id")
	private int id;
	@Id
	@Column(name = "month")
	private int month;
	@Column(name = "salary")
	private int salary;

	public SalaryVer2() {
		super();
	}

	public SalaryVer2(int id, int month, int salary) {
		this.id = id;
		this.month = month;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, month, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaryVer2 other = (SalaryVer2) obj;
		return id == other.id && month == other.month && salary == other.salary;
	}

	@Override
	public String toString() {
		return "SalaryVer2 [id=" + id + ", month=" + month + ", salary=" + salary + "]";
	}

}
