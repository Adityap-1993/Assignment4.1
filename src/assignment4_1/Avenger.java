package assignment4_1;

public class Avenger extends Motorcycle {     //extending superclass 
	
	
	public void bikeinfo(String no,String name) {     //this method will override bikeinfo method of superclass
		 
		
		this.bikeno=no;
		this.ownername=name;
		System.out.println(" ");
		System.out.println("The Avenger's bike no is " +bikeno+ " and it owns to " +ownername+ ".");
		
	}
	
	

}  //class ends
  