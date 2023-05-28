package Learning;

public class Groceryshop {

int mrp, discount, actual_price; 
//Groceryshop()
{
	System.out.println("free home delivery");
}

	


	public Groceryshop(int mrp, int discount) {
	// TODO Auto-generated constructor stub
		this();
		this.mrp = mrp; 
		this.discount = discount; 
		this.actual_price = calculate_price(mrp, discount);
		System.out.println("Welcome");
		
}


	private int calculate_price(int mrp, int discount) {
		// TODO Auto-generated method stub
		return mrp - discount; 
		
	}
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		Groceryshop prod1 = new Groceryshop(100,10);
	    
	  }

	
}


