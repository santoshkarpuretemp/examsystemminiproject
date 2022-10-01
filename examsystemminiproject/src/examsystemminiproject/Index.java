package examsystemminiproject;

public class Index {
	public static void main(String arg[]) {
		 int optionNumber;
		Database database = new Database(); 
		User user = new User();
		optionNumber =user.showOption();
		switch(optionNumber){
		case 1:
			user.login();
		break;
		case 2:
			user.register();
		break;
		default:
			database.close();
			System.exit(0);			
		}
	
		
		//
		
			/*PreparedStatement ps=con.prepareStatement("insert into userdetail(username,pwd,name)values(?,?,?)");
			ps.setString(1, "ashwini");
			ps.setString(2, "ashwini");
			ps.setString(3, "ashwini");
			int x= ps.executeUpdate();
			System.out.println("inserted record"+x);
			ps.close();
			con.close();*/
		
	}
}


