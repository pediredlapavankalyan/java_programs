package assMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "OTO_Student")
@Entity(name = "AssMap.Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int student_id;
	@Column(name = "name", length = 20)
	private String student_name;
	
	@OneToOne(mappedBy = "student")
	private Payment payment;

	public int getStudent_id() {
		return student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	@Override
	public int hashCode() {
		return this.student_id;
	}
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.student_id == other.student_id && this.student_name.equals(other.student_name);
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + "]";
	}

}
