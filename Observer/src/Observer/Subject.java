package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	
	   private List<User> observers = new ArrayList<User>();
	   private String name;
	private String subject;

	   
	 public Subject(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	 

	public Subject() {
		// TODO Auto-generated constructor stub
	}



	public String getUser() {
	      return name;
	   }

	   public void setUser(String name) {
	      this.name = name;
	      notifyAllObservers();
	   }

	   public void attach(User observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (User observer : observers) {
	         observer.update();
	      }
	   } 
	   
	}
	 


