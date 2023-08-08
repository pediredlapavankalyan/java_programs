package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteSale {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Scanner sc = new Scanner(System.in);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement ps = connection.prepareStatement("DELETE FROM SALES WHERE Invno =?");
		System.out.println("Enter invoice number to delete the record");
		ps.setInt(1, sc.nextInt());
		int status = ps.executeUpdate();
		if (status != 0)
			System.out.println("record deleted");
		else
			System.err.println("Invalid Entry");
		connection.close();
	}

}
