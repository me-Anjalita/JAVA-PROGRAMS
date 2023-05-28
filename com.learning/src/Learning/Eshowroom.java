package Learning;

public class Eshowroom {
	int price; //NON STATIC
	int discount; //NON STATIC
	Eshowroom()
	{
		System.out.println("Welcome to our Eshowroom");
	}

	public Eshowroom(int price, int discount) //local variable
//	1.we  never called constructor it is being called automatically when we create objects.
//	2.There is no return data type in 9th line like void or return.
//	3.Constructor name should have the same name of our class name.
	{
		// TODO Auto-generated constructor stub
		this.price=price; //left side golabl right side local.Both global and local name can be same but should differentiate it with this.
		this.discount=discount; //local variable value getting assigned to global variable
		System.out.println("Price is"+ price);
		System.out.println("Discount is"+ discount);
		
	}
	// constructor is useful for intializing object specific  values.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eshowroom tv=new Eshowroom(30000,10);
		Eshowroom fridge=new Eshowroom();
		Eshowroom wm=new Eshowroom();
		Eshowroom ac=new Eshowroom(25000,5);
		tv.buy();
		ac.buy();
		

	}

	private void buy() {
		// TODO Auto-generated method stub
		System.out.println(price); //here price and discount are global variable.
		System.out.println(discount);
		
		
		
	}
//	FOR BOTH STATIC AND NON STATIC.
	// global variable will be intialised with default values.
	//byte,short,int,long---> 0
	//float,double---> 0.0
    //boolean--> false 
    //char --> empty character
    //String, other objects--> null
	
//	OUTPUT 
//	Welcome to our Eshowroom
//	Price is25000
//	Discount is5
//	25000
//	5

}
