package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import com.mysql.cj.jdbc.Driver;

public class JdbcUpdateQuery {

	public static void main(String[] args) throws Exception {

		String ExpectedData = "Guru";
		
		Random ran = new Random();
		int ranValue = ran.nextInt(20);

		//REGISTER TO and load the database driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		//connection has been done to database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

		//creating a statement
		Statement statement = connection.createStatement();

		int result = statement.executeUpdate("insert into students_info values("+ranValue+",'Guru','Hadpad','TYSS')");
		ResultSet SelectResult = statement.executeQuery("select * from students_info");
		while(SelectResult.next()) {
			System.out.println(SelectResult.getString(1));
		}
	}

}
