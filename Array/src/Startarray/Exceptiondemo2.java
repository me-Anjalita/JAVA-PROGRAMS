package Startarray;

public class Exceptiondemo2 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NegativeArraySizeException, ArithmeticException, Exception  {
		// TODO Auto-generated method stub
		int[] marks = {98,95,100,94};
//we can give < or>5 numbers in the array,becoz in our old class we gave coding for 5 values only
		try {
			Errordemo.display(marks);//another class's method
			}
			catch(ArrayIndexOutOfBoundsException aa)
			{
				System.out.println("Check array ");
			}
		

	}

}
