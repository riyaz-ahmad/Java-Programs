package myswing;

import java.sql.*;

public class Conn{
	Connection c;
	Statement s;
	
	public Conn(){
		try{
			Class.forName("com.mysql.jdbc.driver");
			c = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Riya");
			s = c.createStatement();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}