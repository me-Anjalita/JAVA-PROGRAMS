package Startarray;
//MULTIPLE INHERITANCE-Inheriting the rules through implements and extend keyword.
public class Citizen extends Parents implements Govt,Zoho,StateGovt{ //There can be more than 1 interface after "implements"
   
	int no; //this is for the citizen if he wants he can enter the detials using this variable.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For dynamic binding we r trying this
		Govt officer = new Citizen(); 
		//
		officer.displayIDProof();
		
		Citizen citizen1=new Citizen();
		Citizen citizen2=new Citizen();
		citizen1.watchMovies();
	    citizen2.change2000Rupees();
	    citizen1.displayAddressProof();
	    System.out.println(Govt.fine_for_helmet);
	    System.out.println(Govt.last_date);
	    
		

	}
	public void watchMovies() //For this the override keyword wont come becoz this activity is done by citizen on its own
	  {
	    System.out.println("Watching Movies");
	  }
	

	@Override //All the defined methods of govt class are given below
	 public void change2000Rupees() {
	    // TODO Auto-generated method stub
	    System.out.println("Changing in Bank");
	  }
	  @Override
	  public void displayIDProof() {
	    // TODO Auto-generated method stub
	    System.out.println("Aadhar Card");

	  }
	  @Override
	  public void displayAddressProof() {
	    // TODO Auto-generated method stub
	    System.out.println("Ration Card");

	  }
	  @Override
	  public void wearHelmet() {
	    // TODO Auto-generated method stub
	    System.out.println("Follow Traffic Rules");

	}
	@Override //From here the zoho's methods have been implemented
	public void develop() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override //From here parent class method is defined[METHOD DEFINITION]
	void study() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}
	@Override //From stategovt the methods are defined
	public void provide_Electricity() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lay_roads() {
		// TODO Auto-generated method stub
		
	}

}
