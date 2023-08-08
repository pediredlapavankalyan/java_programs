package jpa;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "Salaries")
public class Salaries {
	@EmbeddedId
	private SalaryKey salaryKey;
	@Column(name = "salary")
	private int salary;

	public SalaryKey getSalaryKey() {
		return salaryKey;
	}

	public void setSalaryKey(SalaryKey salaryKey) {
		this.salaryKey = salaryKey;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salary, salaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salaries other = (Salaries) obj;
		return salary == other.salary && Objects.equals(salaryKey, other.salaryKey);
	}

	@Override
	public String toString() {
		return "Salaries [salaryKey=" + salaryKey + ", salary=" + salary + "]";
	}

}
