package examsystemminiproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
	public static String username;
	public static String pwd;
	public static String name;
	
	public Connection con=null;
	public PreparedStatement ps =null;
	public  Connection dbConnect(){
		
		// database connectivity
		try {//Load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/examsystemminiproject", "root", "root");
		
		}catch(Exception e) {  
			e.printStackTrace();
		 }
		return con;
	}
	public  void close() {
		try {
		con.close();
		ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//setters and getters for database
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		Database.username = username;
	}
	public static String getPwd() {
		return pwd;
	}
	public static void setPwd(String pwd) {
		Database.pwd = pwd;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Database.name = name;
	}
	public boolean isUserNameExist(String username)  {
		boolean b=false;
		try {
		ps = con.prepareStatement("select * from userdetail where username =?;");
		ps.setString(1, username);
		b=ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.close();			
		}
		
		return b;
		
	}
}
	
