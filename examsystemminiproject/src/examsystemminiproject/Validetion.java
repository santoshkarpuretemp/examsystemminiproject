package examsystemminiproject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validetion {
	Database database=new Database();
	Scanner sc= new Scanner(System.in);
	
	public boolean optionValidetion(int i) {
		if (i==1 || i==2|| i==3) {
			return true;
		}
		else return false;
	}
	public boolean patternMatch(String username) {
		/*    “^” represents that starting character of the string.
	    “[A-Za-z]” makes sure that the starting character is in the lowercase or uppercase alphabet.
	    “\\w{5, 29}” represents a check to make sure that the remaining items are word items, which includes the underscore, until it reaches the end and that is represented with $.
	    The “{5, 29}” represents the 6-30 character constraint given to us minus the predefined first character.*/
			// Regex to check valid username.
	        String regex = "^[A-Za-z]\\w{5,29}$";
	  
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	  
	        // If the username is empty
	        // return false
	        if (username == null) {
	            return false;
	        }
	  
	        // Pattern class contains matcher() method
	        // to find matching between given username
	        // and regular expression.
	        Matcher m = p.matcher(username);
	  
	        // Return if the username
	        // matched the ReGex
	        return m.matches();
	}
	public boolean validateusername(String username) {
		if(patternMatch(username)) {
			if(database.isUserNameExist(username)) {
				System.out.println("This username is alrady exist please try another one");
				return false;
				
			}
			
			
			return true;
		}
		else {
			System.out.println("please follow the given instruction and try again");
			System.out.println("makes sure that the entered username  is in the lowercase or uppercase alphabet");
			System.out.println("user name should not start with digt and the length in between 6 to 30 charchters");
		}
		return false;
	}

	
	
	 public boolean validatepwd (String password)
	    {
	  
	        // Regex to check valid password.
	        String regex = "^(?=.*[0-9])"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=.*[@#$%^&+=])"
	                       + "(?=\\S+$).{8,20}$";
	  
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	  
	        // If the password is empty
	        // return false
	        if (password == null) {
	            return false;
	        }
	  
	        // Pattern class contains matcher() method
	        // to find matching between given password
	        // and regular expression.
	        Matcher m = p.matcher(password);
	  
	        // Return if the password
	        // matched the ReGex
	        return m.matches();
	    }
	 public boolean validateName( String name) {
	      return name.matches( "[A-Z][a-z]*" );
	   }
	  
	
	
	
	
	
}
