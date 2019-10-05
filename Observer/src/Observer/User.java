package Observer;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Subject subject;

	  

	   public void update() {
		   System.out.println("Notification sent to: ");
	      System.out.println(    subject.getUser()  ); 
	   }
}
