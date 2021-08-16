
public class UserManager {
	
	public void save(User user) {
		
		System.out.println(user.getFirstName()+" Kullanicisi kaydedildi");
	}
	
     public void remove(User user) {
		
		System.out.println(user.getFirstName()+" Kullanicisi kaldirildi");
	}
     
     public void list(User user) {
    	 
    	 System.out.println("Kullanicilar Listeleniyor..");
    	 System.out.println(user.getFirstName()+" "+user.getLastName()+" "+user.getAge());
 
    	
    	 
     }

}
