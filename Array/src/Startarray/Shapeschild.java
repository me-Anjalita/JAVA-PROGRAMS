package Startarray;

public class Shapeschild extends Shapes{

	@Override//if u dont want this u can erase it too.
	//this override is known as Annotation.Method that was overrided from parent class.
	//And no access specifiers can be used for it.
	void calculat_area3() { //the abstract class is called here
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Shapeschild sc=new Shapeschild();
		sc.calculate_area(0);
		sc.calculate_area2(10,20);
		
		
		
	}

}
