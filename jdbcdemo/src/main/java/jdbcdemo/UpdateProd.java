package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateProd {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Scanner sc = new Scanner(System.in);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement ps = connection.prepareStatement("update products set prodname=? where prodid=?");
		System.out.println("Enter new name for product");
		String newName = sc.nextLine();
		System.out.println("Enter product id ");
		ps.setInt(2, sc.nextInt());

		ps.setString(1, newName);
		int status = ps.executeUpdate();
		if (status == 0) {
			ps = connection.prepareStatement("insert into products values(?,5000,1,null,'CAT006')");
			ps.setString(1, newName);
			ps.execute();
			System.out.println("new row inserted");
		} else
			System.out.println("successsfully updated");
		connection.close();
	}

}
