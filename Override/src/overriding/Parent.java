package overriding;

public class Parent {
	  final int balance = 100000; // final is final we cannot make anykind of modification in this balance at our child class
	  

	  protected void receive()
	  {
	    System.out.println("Taking Care of Relatives");
	  }
	  
	  void cook()
	  {
	    System.out.println("Cooking");
	  }
	  
	  
	  final void getMarried()
	    {
	        
	    }

	}