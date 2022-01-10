package jdbcProject;
import java.sql.*;

public class DemoConnectivity 
{
	public static void main(String[] args) throws Exception
	{
		try {
			String url="jdbc:postgresql://localhost/Practice";
			String user="postgres";
			String password="Naveen@305";
			//DriverManager.registerDriver(new com.postgresql.jdbc.Driver());
			//instead oof creating this we can use forName
			//Class.forName("com.postgresql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from person;");

			while(rs.next())
			{
				String name=rs.getString(2);
				System.out.println(name);
			}

			stmt.close();
			con.close();
		}catch(Exception e)
		{
			System.out.println("Quary excuted successfully");
		}

	}

}
