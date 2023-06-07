package Startarray;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 8;
	    switch (day) {
	      case 1:
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      default://if we r writing this default in between the cases then should use the break statement orelse no need of using the break statement if the default is given as the last statement.
	         System.out.println("Invalid input");
	         break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	       
	    }

	}

}
