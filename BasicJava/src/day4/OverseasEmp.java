package day4;

public class OverseasEmp extends SalariedEmp {
	private int allowance;

	public OverseasEmp(String name, String job, int salary, int allowance) {
		super(name, job, salary);
		this.allowance = allowance;
	}

	int getAllowance() {
		return allowance;
	}

	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println(this.allowance);
	}
}
