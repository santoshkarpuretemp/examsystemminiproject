package examsystemminiproject;

import java.util.Scanner;

public class User {
	String username;
	String pwd;
	Scanner sc =new Scanner(System.in);
	Validetion validetion =new Validetion();
	//setters and getters for user
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//method for showing option for user and getting the correct input
	public int showOption() {
		System.out.println("please select the following options in number form ");
		System.out.println("1.login");
		System.out.println("2.register");
		System.out.println("3.exit");
		int i =sc.nextInt();
		if(validetion.optionValidetion(i))
		return i;
		else {
			System.out.println("Please enter the valid input");
			this.showOption();
		}
		return i;
		}
	//method for registering user 
	public boolean register() {
		System.out.println("Please enter the username ");
		String username =sc.next();
		if(validetion.validateusername(username)) {
			Database.setUsername(username);
		}
		else {
			register();
		}
		System.out.println("enter the password");
		String pwd = sc.next();
		if(validetion.validatepwd(pwd)) {
			Database.setPwd(pwd);
		}
		else
		{
			System.out.println("    It contains at least 8 characters and at most 20 characters.\r\n"
					+ "    It contains at least one digit.\r\n"
					+ "    It contains at least one upper case alphabet.\r\n"
					+ "    It contains at least one lower case alphabet.\r\n"
					+ "    It contains at least one special character which includes !@#$%&*()-+=^.\r\n"
					+ "    It doesn’t contain any white space.");
			register();
		}
		System.out.println("enter your name");
		String name=sc.next();
		if(validetion.validateName(name)) {
			Database.setName(name);
		}
		else {
			System.out.println("enter correct name");
			
		}
		return false;
	}
	
	// to verify the user is providing correct input
	
	
	public boolean login() {
		System.out.println ("Enter your name name ");
		if
	}


}
