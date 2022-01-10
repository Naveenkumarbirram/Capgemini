package jdbcProject;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcConnection 
{
	private final String url="jdbc:postgresql://localhost/Practice";
	private final String user="postgres";
	private final String password="Naveen@305";
	private void connect()
	{
		try(Connection connection=DriverManager.getConnection(url, user, password);)
		{
			if(connection!=null)
			{
				System.out.println("Successfully connected");
			}
			else
			{
				System.out.println("Connection Failed");
			}
			java.sql.Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery("select * from person");
			while(result.next())
			{
				System.out.println(result.getInt(1)+" | "+result.getString(3));
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			//System.out.println("Connection handled");
		}
	}
	public static void main(String[] args)
	{
		jdbcConnection conn=new jdbcConnection();
		conn.connect();


	}
}
