package inheritance;

public class TestDoc {
	public static void main(String[] args) {
		ConsultantDoctor cd1 = new ConsultantDoctor("Pavan ", "eye", 12, 1200);
		ConsultantDoctor cd2 = new ConsultantDoctor("Pavan ", "eye", 12, 1200);
		System.out.println(cd1);
		System.out.println(cd1.equals(cd2));
	}
}
