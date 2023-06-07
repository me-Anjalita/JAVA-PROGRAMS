package Startarray;

public class Recursiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursiondemo rd = new Recursiondemo();
		rd.display(10);

	}

	private void display(int no) {
		// TODO Auto-generated method stub
		System.out.println(no);
	    no = no+10; //Each time number will get incremented until the value is 50
	    if(no<=50) 
	    {
	      
	    display(no);
	    }
	    
	  }

}
//output
//10
//20
//30
//40
//50

