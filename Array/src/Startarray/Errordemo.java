package Startarray;

public class Errordemo {

	public static void main(String[] args) throws Exception  //checked exception should compulsorily be declared at the main method.If needed all exceptions can also be mentioned
	{//checked exception should be given in both main method as well as in the method declaration
		// TODO Auto-generated method stub
		int[] marks = {100,90,97, 96, 92};
		display(marks);//we r giving the array as a input

		  }

		  public static void display(int[] ar) //using throws is to indicate the possible exceptions that could be raised in a program.
		throws ArrayIndexOutOfBoundsException,
		NegativeArraySizeException, //the length of error should not be negative
		ArithmeticException,Exception //during calculation
		  {
			  int total = 0; 
		    for(int i=0; i<5;i++) //i==4
		    {
		      total = total + ar[i];  //0+100=100; 100+90=190; 190+97=287;
		    }
		    
		  System.out.println("total "+ total);
		  }

	}



