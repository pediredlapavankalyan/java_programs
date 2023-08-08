package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProdSaleDetails {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Scanner sc = new Scanner(System.in);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement ps = connection.prepareStatement("select invno,prodname,qty,amount,transdate "
				+ "from products p join sales s on(p.prodid=s.prodid) where catcode=?");
		System.out.println("Enter catcode to get sales details");
		ps.setString(1, sc.nextLine());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.printf("%d %-15s %4d %2f %s \n", rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
					rs.getDate(5));
		}
		connection.close();
	}

}
