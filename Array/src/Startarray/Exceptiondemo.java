package Startarray;

import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptiondemo ed=new Exceptiondemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt(); 
		
		
		ed.divide(no1,no2);
		ed.subtract(no1,no2);
		
		
	}

	private void subtract(int no1, int no2) {
		// TODO Auto-generated method stub
		System.out.println(no1-no2);
		
	}
//OUTPUT:when we give 100 and 10
//90
	private void divide(int no1, int no2) {
		// TODO Auto-generated method stub
		try {//when we have a guess that error might rise we must give try
//TRY:exception possibl part
			// We are giving try and catch inorder to overcome any kind of exception.
			System.out.println(no1/no2);
		}
		catch(ArithmeticException s)//
		{
//CATCH:Exception handling part-area 
			System.out.println("Check no2");
		}
		
		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException nnn)
		//in this we r mentioning 2 exception in one catch itself
	    {
	  System.out.println("Check Array length. ");
	    }
		
	    catch(Exception e)//when we dont know what exception will arrive we will give this.
	   //this catch should be given only at the last orelse those above exceptions will raise error when given below this exception
	  //Exception is the base class
		//in the place of exception u can also give Throwable word
		{
	      System.out.println("Something went wrong ");
	    }
		
		finally {//finally used when DB disconections is needed 
			//finally block will get excecuted always if exception happens or not.
			//code cleaning area: 
			System.out.println("Check me ");
			}
		
		
	}
	
	
//OUTPUT: when we give 100 and 10
//10
}
