package overriding;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		System.out.println(ch.balance); //no modification can be done in this balance becoz it is stated as final in parent cass.
		//ch.receive();  // from parent class we r calling the method "receive" in child class
		//Dynamic binding
		Parent pa=new Child();// whatever is there in parent class that will be executed
		//pa.cook();
		pa.receive();
		ch.develop_java_applications();
		}
	public void develop_java_applications()
	{
		System.out.println("Java Developer");
	}
	 public void receive() 
	 //the Public should not be private becoz it is protected in parent class,it should not get reduced only be incresead.
	{
		System.out.println("Taking care of relatives and friends"); // here we r modifying and upgrading the sentence in child class
//	    super.receive(); // super class instance it means superior class i.e parent class
	}
	

}
