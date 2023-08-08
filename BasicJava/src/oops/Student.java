package oops;

public class Student {
	private int admno;
	private String name;
	private int feePaid;
	private int course;
	private static int javaFee = 12000;
	private static int pythonFee = 10000;

	public Student(int admno, String name, int course) {
		this.admno = admno;
		this.name = name;
		this.course = course;
	}

	public Student(int admno, String name, int course, int feePaid) {
		this(admno, name, course);
		this.feePaid = feePaid;
	}

	void payment(int payment) {
		feePaid += payment;
	}

	int getDue() {
		if (course == 1)
			return javaFee - this.feePaid;
		else
			return pythonFee - this.feePaid;
	}

	int getTotalFee() {
		if (course == 1)
			return javaFee;
		else
			return pythonFee;
	}

	int getFeePaid() {
		return this.feePaid;
	}

	String getCourseName() {
		if (course == 1)
			return "Java";
		else
			return "Python";
	}

}
