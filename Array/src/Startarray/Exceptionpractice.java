package Startarray;

public class Exceptionpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptionpractice n = new Exceptionpractice(); 
		n.addition();
		

	}

	private void addition() {
		// TODO Auto-generated method stub
		try{
			System.out.println(10+20);
	     }
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		finally {
			System.out.println("HAI"); //even though if error comes or not at the try statement finally statement will get executed and the line will be printed.
		}
		
	}

}
