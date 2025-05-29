package polymorphism12;

//2) Runtime Polymorphism in Java

class Bike
   {    
	 void run()
	  {
		 System.out.println("running");
	  }    
	}    
	class Splendor extends Bike
	{    
	  void run()
	  {
		  System.out.println("running safely with 60km");
	  }    
	}  
	public class Poly2{  
	  public static void main(String args[]){    
	    Bike b = new Splendor();//upcasting    
	    b.run();    
	  }    
	}   