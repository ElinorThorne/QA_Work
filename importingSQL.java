import java.sql.*;

public class importingSQL 
{
	public static void main(String[] args) 
	{
		try
		{
			//importingSQL.forName("com.mysql.Jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/elinor","root","");
			Statement stm = con.createStatement();
			ResultSet RS = stm.executeQuery("Select * from asda");
			while(RS.next())
			{
				System.out.print(RS.getString(1));
				System.out.print(RS.getFloat(2));
				System.out.print(RS.getInt(3));
				System.out.println();
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("No Driver");
		}
		catch(SQLException s)
		{
			System.out.println(s.toString());
		}
	}
}
