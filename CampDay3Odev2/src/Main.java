
public class Main {

	public static void main(String[] args) {
	
		
		User[] users=new User[] {new Student("Helin","Sever",26), new Instructor("Engin","Demirog",35)};
		
		UserManager userManager= new UserManager();
		
		for(User user: users) {
			
			userManager.save(user);
			userManager.remove(user);
			userManager.list(user);
		}
		
		
       
			
		

	}

}
