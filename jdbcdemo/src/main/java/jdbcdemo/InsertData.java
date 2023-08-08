package jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Scanner sc = new Scanner(System.in);
		try {
			Connection connection = DriverManager.getConnection(url);
			System.out.println("connection estd");
			PreparedStatement ps = connection.prepareStatement("insert into products values(?,?,?,?,?)");
			System.out.println("Enter prod name");
			ps.setString(1, sc.nextLine());
			System.out.println("Enter price");
			ps.setInt(2, sc.nextInt());
			System.out.println("Enter qoh");
			ps.setInt(3, sc.nextInt());
			sc.nextLine();
			System.out.println("Enter remarks ");
			ps.setString(4, sc.nextLine());
			System.out.println("Enter category");
			ps.setString(5, sc.nextLine());
			ps.executeUpdate();
			System.out.println("Data Inserted");
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}
}
