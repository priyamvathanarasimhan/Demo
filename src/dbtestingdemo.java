import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;


public class dbtestingdemo {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port = "3306";
		// TODO Auto-generated method stub
			Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt", "root", "password");
			
			java.sql.Statement s = con.createStatement();
			ResultSet rs= s.executeQuery("select * from employee");
			
			while(rs.next()){
				System.out.println(rs.getString("empname"));
				System.out.println(rs.getString("location"));
		}
			}
			

}
