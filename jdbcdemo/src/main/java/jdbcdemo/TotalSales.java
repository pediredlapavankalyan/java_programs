package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TotalSales {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Scanner sc = new Scanner(System.in);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement ps = connection.prepareStatement("Select sum(amount) from sales where prodid=?");
		System.out.println("Enter product id");
		ps.setInt(1, sc.nextInt());
		int sum = 0;
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			sum = rs.getInt(1);
			System.out.println("Total sale amount: " + sum);
		} else
			System.out.println("Total sale amount: " + sum);
		connection.close();
	}

}
