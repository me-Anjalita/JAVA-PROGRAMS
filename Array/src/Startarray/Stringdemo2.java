package Startarray;

public class Stringdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringdemo2 sd=new Stringdemo2();
		String s="IPL Ended yesterday";
		String[] ss=s.split(" ");
		for(int i=0;i<ss.length;i++) //this is all about to split the array into seperate words
		{
			System.out.println(ss[i]);
		}
		//Actually should not  do in main method just for reference we did thats it.
		//String date = "30/05/2023";
		//String[] ds = date.split("/");
		//for(int i=0;i<ds.length;i++)
			//System.out.println(ds[i]);
//output
//	30
//	05
//	2023
//		
	
		//sd.check_start();
		//sd.check_ends();
		
	}

	

	private void check_ends() {
		// TODO Auto-generated method stub
		String name1 = "sabaribala";
		String name2 = "bala";
		boolean ends = true;
		int len1 = name1.length()-1; //bala alone we r checking
		for(int len2 = name2.length()-1; len2>=0;len2--)
		{
		  if(name1.charAt(len1)== name2.charAt(len2))
		  {
		    len1--;
		    continue; 
		  }
		  else
		  {
		    System.out.println("No, not ends with");
		    ends = false; 
		    break; 
		  }
		}  
		if(ends == true)
		{
		  System.out.println("yes, ends with "+name2);
		}
		 
}

//output
//	yes, ends with bala
		
	

	private void check_start() {
		// TODO Auto-generated method stub
		String name1 = "sabaribala";
	    String name2 = "sab";
	    boolean starts = true; 
	for(int i=0; i<name2.length();i++)  {  
	    if(name1.charAt(i) == name2.charAt(i))
	    {
	      continue;
	    }
	    else
	    {
	      starts = false; 
	      break; 
	    }
	  }
	  if(starts==true) //if the first 3 letters match it will be true
	  {
	    System.out.println("yes" + name1 + " starts with "+name2);
	  }
	  else
	  {
	    System.out.println("Not starts with "+name2);
	  }
	
		
	}
	
		
		

	}
//output
//yes sabaribala starts with sab


