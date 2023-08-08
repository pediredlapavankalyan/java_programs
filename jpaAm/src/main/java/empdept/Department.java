package empdept;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="OTM_Department_1")
@Entity(name="empdept.Department")
public class Department {
	@Id
	private String deptcode;
	private String deptname;
	@OneToMany(mappedBy = "department", fetch = FetchType.EAGER)  // default is lazy 
	private List<Employee> employees = new ArrayList<Employee>();
	
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	

}
