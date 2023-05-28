package Startarray;

public abstract class Shapes { //this line arise by right clicking the method calling of abstract
//Abstraction:Showing only necessary data and hiding unwanted implementation details.
	//WIthout inheritance we cant access abstract class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Instantiation-object creation
//we cannot instantiate abstract class
//		Shapes square=new Shapes();
//		Shapes rectangle=new Shapes();//we cant create objects for these when there is abstract
//		Shapes circle=new Shapes();
		
//		square.calculate_area(40);
//		rectangle.calculate_area2(40,30);

	}
	
//If atleast one method in class is abstract then the entire class should be abstract.
//An abstract class may or may not include abstract methods.
//Minimum of 0 abstract methods can be in abstract class
//
abstract void calculat_area3();

	 void calculate_area2(int len, int bre) {
		// TODO Auto-generated method stub
		System.out.println(len*bre);//output:1200
		
	}

	 void calculate_area(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*a); //output:1600
		
	}

}
