import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class importingSQL2 
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
			int UP = stm.executeUpdate("UPDATE `asda` SET `price`=1.20 WHERE product='carr'");
			int DEL = stm.executeUpdate("DELETE FROM `asda` WHERE product='Fruit'");
			int INS = stm.executeUpdate("Insert into Asda values('Fruit', 1.50, 3)");
			ResultSet RS = stm.executeQuery("Select * from Asda");
			System.out.println("Product Price Quantity");
			System.out.println("**********************");
			while(RS.next())
			{
				System.out.print(RS.getString(1) + "\t");
				System.out.print(RS.getFloat(2) + "\t ");
				System.out.print(RS.getInt(3) + "\t");
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
