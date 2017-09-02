package assignment4_1;

public class Motorcycle {   //class definition 

	protected String ownername;    //instance variable 1
	
	protected String  bikeno;      //instance variable 2

	
	//overloading two methods with same name 'bike info'
	
	public void bikeinfo(String  no)        //method 1 with one parameter
	{
		this.bikeno=no;
		System.out.println("The Bike no is " +bikeno);
	}
	
	public void bikeinfo(String  no,String name)    //method 2 with two parameters
	{
		this.bikeno=no;
		this.ownername=name;
		System.out.println("The Bike no is " + bikeno + "and it owns to " + ownername + ".");
	}
	
	
}  //class ends
