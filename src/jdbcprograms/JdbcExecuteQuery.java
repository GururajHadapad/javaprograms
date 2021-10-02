package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JdbcExecuteQuery {

	public static void main(String[] args) throws Exception {
		
		String ExpectedData = "Guru";
		
		//REGISTER TO and load the database driver
	Driver driver = new Driver();
DriverManager.registerDriver(driver);

//connection has been done to database
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

//creating a statement
Statement statement = connection.createStatement();


ResultSet result = statement.executeQuery("Select * from students_info");

while(result.next())
{
	System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
	 String ActualData = result.getString(2); 
	 if (ExpectedData.equals(ActualData))
	 { 
		 System.out.println("Authenticated used"); 
		 break; 
	 }
	 else
	 {
		 System.out.println("Invalid user");
	 }
	 
}
connection.close();
	}

}
