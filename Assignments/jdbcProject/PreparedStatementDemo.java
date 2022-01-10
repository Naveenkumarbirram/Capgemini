package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo 
{
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:postgresql://localhost/Practice";
		String user="postgres";
		String password="Naveen@305";
		int id=1000;
		String first_name="Naveenkumar";
		String last_name="Birram";
		String email="bnaveenkumar1122@gmail.com";
		String gender="Male";
		String country="India";
		
		String quary="insert into person values (?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url, user,password);
		PreparedStatement stmt=con.prepareStatement(quary);
		stmt.setInt(1, id);
		stmt.setString(2, first_name);
		stmt.setString(3, last_name);
		stmt.setString(4, email);
		stmt.setString(5, gender);
		stmt.setString(6, country);
		int count = stmt.executeUpdate();
		
		System.out.println(count+ " Rows affected");
		stmt.close();
		con.close();
		
	}

}
