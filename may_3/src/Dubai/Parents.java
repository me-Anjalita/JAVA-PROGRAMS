package Dubai;

public class Parents {

	public void take_to_movies(Children child)//class name and then object name
	{
		// TODO Auto-generated method stub
		//local variable cab be assigned 
		String name ="kumar";
		System.out.println(name.getClass());
		System.out.println(name);
		
		System.out.println(child.name);   //Rahul : will get printed
		OnePlus op=new OnePlus();
		System.out.println(op.getClass());
		Parents pa = new Parents(); 
	    pa.going_out(op);
	  }

	  private void going_out(OnePlus op) //This means that the class name should always be entered with the object name in the bracket 
	  {
	    // TODO Auto-generated method stub
	    op.charge();
	    op.call();
	    
	  }
		
		
		
	}



	

