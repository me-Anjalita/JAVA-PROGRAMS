package Startarray;

public class Lowattendencexception extends RuntimeException{
	//there is a error default serial version ID
	
	//All these are the parent and child of eachother
	//Throwable
	//Exception
	//RuntimeException
	//throw
	
	public Lowattendencexception(String msg)
	{
		// TODO Auto-generated constructor stub
	    System.out.println(msg);
	  }
	
	 public Lowattendencexception() {
		    // TODO Auto-generated constructor stub
		  }


	  public void allowforExams(int attendence)
	  {
		  //100/0
		  //-5
		  //
		  
		  if(attendence>=75)
		  {
			  System.out.println("permit students");
		  }
		  
		  else //(Explicit throwing)
		  {
			try {
				 Lowattendencexception lae = new Lowattendencexception();
			     
				throw lae;//user defines exception // lae is just a object name
				//this throw statement is to throw an object to jvm
				//in method signature we will be giving throws
				
				//throw new Lowattendencexception(); //Anonymous Object  //Instead of 25 and 27 line we can give just one line
			 //we r creating error with our own class.THROW is user defined.
			} 
			
			
		  
		   catch (Lowattendencexception ll) //throw keyword will throw the object to jvm and jvm will call the object of the given class and will print the statement that is given in the catch.
			{
				System.out.println("Check Attendance");
			}
	  }
  }
}
