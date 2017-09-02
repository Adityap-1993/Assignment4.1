package assignment4_1;

public class Main {       //main class definition

	public static void main(String[] args) {    //main method starts here 
		// TODO Auto-generated method stub
		
		Avenger av=new Avenger();               //creating subclass object
		av.bikeinfo("MH 11 AS 1560");
		
		av.bikeinfo("MH 11 CB 9706", "Pranav");    //here it will call method defined in avenger class overriding  superclass method 

	}

}//class ends
