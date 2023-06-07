package Startarray;

public class Switchcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greetings = "Hello"; //if u give hell ,inappropriate word then error will be raised
	    switch (greetings) {
	      case "Hi":
	        System.out.println("Hi Good Morning");
	        break;
	      case "Hello":
	        System.out.println("Hello Good Morning");
	        break;
	      
	      default:
	         System.out.println("Invalid input");
	         //break; //No need to use break statement if default is the final statement of a program.
	    }

	}
}


