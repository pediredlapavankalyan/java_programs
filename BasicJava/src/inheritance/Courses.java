package inheritance;

class Courses {
	protected String title;
	protected int fee;
	protected int duration_in_months;

	public Courses(String title, int fee, int duration_in_months) {
		this.title = title;
		this.fee = fee;
		this.duration_in_months = duration_in_months;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getDuration_in_months() {
		return duration_in_months;
	}

	public void setDuration_in_months(int duration_in_months) {
		this.duration_in_months = duration_in_months;
	}

	void print() {
		System.out.println(this.title);
		System.out.println(this.fee);
		System.out.println(this.duration_in_months);
	}

}

class OnlineCourse extends Courses {

	private String url;

	public OnlineCourse(String title, int fee, int duration_in_months, String url) {
		super(title, fee, duration_in_months);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	void print() {
		super.print();
		System.out.println(this.url);
	}

}

class ClassroomCourse extends Courses {

	private String address;
	public ClassroomCourse(String title, int fee, int duration_in_months, String address) {
		super(title, fee, duration_in_months);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	void print() {
		super.print();
		System.out.println(this.address);
	}

	@Override
	public double getFee() {
		return 0.9* fee;
	}

}
