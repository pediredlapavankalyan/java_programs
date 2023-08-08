package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlserver://localhost:1433;user=sa;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true";
		Scanner sc = new Scanner(System.in);
		Connection connection = DriverManager.getConnection(url);
		connection.setAutoCommit(false);
		try {
			Statement statement = connection.createStatement();

			String query = "update products set price=price+(price*0.1) where prodid=340";
			int status = statement.executeUpdate(query);
			if (status == 0)
				throw new Exception();
			System.out.println("1 success");
			String query1 = "update products set price=price+(price*0.1) where prodid=341";
			status = statement.executeUpdate(query1);
			if (status == 0)
				throw new Exception();
			System.out.println("2 success");
			String query2 = "update products set price=price+(price*0.1) where prodid=342";
			status = statement.executeUpdate(query2);
			if (status == 0)
				throw new Exception();
			System.out.println("3 success");
			connection.commit();
			System.out.println("successfull");
		} catch (Exception e) {
			System.out.println("error");
			connection.rollback();
		}
		connection.close();
	}

}
