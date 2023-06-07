package Startarray;

public class Exceptiondemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lowattendencexception l = new Lowattendencexception();
		//l.allowforExams(78);
		Exceptiondemo3 e=new Exceptiondemo3();
		e.div();
		
	}
	private void div() {
	    // TODO Auto-generated method stub
	    try {
	      System.out.println(10/0);
	    }
	    catch(ArithmeticException ae) {
	      System.out.println(ae.getMessage()); //getmessage is used to get the message printed in the output which is shown in the error time,
	      ae.printStackTrace(); //this is used to indicate the full error of the method
	    }
	    System.out.println("Hi");
	  }

	}


