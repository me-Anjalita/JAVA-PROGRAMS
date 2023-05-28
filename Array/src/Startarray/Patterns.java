package Startarray;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Patterns p1=new Patterns();
		//Patterns p2=new Patterns();
		//Patterns p3=new Patterns();
		//Patterns p4=new Patterns();
		//Patterns p5=new Patterns();
		//Patterns p6=new Patterns();
		Patterns p7=new Patterns();
		//Patterns p8=new Patterns();
		//Patterns p9=new Patterns();		
		//p1.pattern1();
		//p2.pattern2();
		//p3.pattern3();
		//p4.pattern4();
		//p5.pattern5();
		//p6.pattern6();
		p7.pattern7();
		//p8.pattern8();
		//p9.pattern9();
		

	}

	

	private void pattern9() {
		// TODO Auto-generated method stub
		for(int count = 1;count<=5; count++)
		{
		    for(int no=count; no<=5; no++)
		    {   System.out.print(no+" ");   }
		    System.out.println(); 
		}
		
		
		
	}
//OUTPUT
//	1 2 3 4 5 
//	2 3 4 5 
//	3 4 5 
//	4 5 
//	5 




	private void pattern8() {  //if u want u can do it like exact the same way of p3.pattern3 with a small change in 30th line as u have done
		// TODO Auto-generated method stub
		for(int i = 5;i>=0; i--)
		{
		    for(int j=0; j<=i;j++)
		    {   System.out.print("*" + "  ");   } // compared to p3.pattern3 a change is made in this line at "*".
		    System.out.println(); 
		}
//output
//		*  *  *  *  *  *  
//		*  *  *  *  *  
//		*  *  *  *  
//		*  *  *  
//		*  *  
//		*  

		
	}
	
	private void pattern7() {   
		// TODO Auto-generated method stub
		 
	    int num = 15; 
	    for(int row =5;row>=1;row--) //row=5 means we r in need of 5 rows in the output,and it also means that in the 1st line we need 5 values.
	    {
	    for(int col=1; col<=row; col++) //1<=5,2<=5,3<=5,4<=5,5<=5,6<=5
	    { 
	      System.out.print(num + " ");//15 ,14, 13, 12, 11,loop breaks and moves to new line same execution takes place
	      num--;   //this step decides that numbers should be printed below 15
	    }
	    System.out.println(); 
	    
	    }
	
	}
//output
//	15 14 13 12 11 
//	10 9 8 7 
//	6 5 4 
//	3 2 
//	1 

		
	

	private void pattern6() {
		// TODO Auto-generated method stub
		 int count =5; 
		    int num = 1; 
		    while(count>=1)
		    {
		    for(int no=1; no<=count; no++)
		    { 
		      System.out.print(num + "");
		      num++; //this step decides that number should be printed above 1
		    }
		    System.out.println(); 
		    count--; 
		    }
		
		
	}
		 
//output
//	1 2 3 4 5 
//	6 7 8 9 
//	10 11 12 
//	13 14 
//	15 
	 

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int count = 5;count>=1; count--)
		{
		    for(int no=count; no>=1; no--)
		    {   System.out.print(no+" ");   }
		    System.out.println(); 
		}
		
	}
////output
//	5 4 3 2 1 
//	4 3 2 1 
//	3 2 1 
//	2 1 
//	1 

	private void pattern4() {
		// TODO Auto-generated method stub
		int count = 1; 
		while(count<=5) //we r giving this condition becoz each time we should -1 the no from 5
		{
		    for(int no=5; no>=count; no--) {
		    System.out.print(no+" "); 
		    }
		    System.out.println(); 
		count++; //1+1,2+1,3+1
		}
//output
//		5 4 3 2 1 
//		5 4 3 2 
//		5 4 3 
//		5 4 
//		5 
		
	}
		
	

	private void pattern3() {
		// TODO Auto-generated method stub
		int count = 5; 
		while(count>=1) //we r giving this condition becoz each time we should -1 the no from 5
		{
		    for(int no=1; no<=count; no++) {
		    System.out.print(no+" "); 
		    }
		    System.out.println(); 
		count--; //5-1,4-1,and 3-1 will not workout becoz we gave count<=3
		}
		
	}
//output
//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1  this will be output when we give count>=1
	

	private void pattern2() {
		// TODO Auto-generated method stub
		//for(int count = 1; count<=25;count++)   No need of this line this is to repeat the same numbers
		{
		    for(int no = 1; no<=25; no++)
		    {
		    System.out.print(no+" "); 
		    if(no%5==0)
		    {
		    	System.out.println(" "); //This line is to move to next line
		    	
		    }
		    }
		   // System.out.println(); 
		}
//output
//		1 2 3 4 5  
//		6 7 8 9 10  
//		11 12 13 14 15  
//		16 17 18 19 20  
//		21 22 23 24 25  

		
	}
		
	

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int count = 1; count<=3;count++)
		{
		    for(int no = 1; no<=5; no++)
		    {
		    System.out.print(no+" "); 
		    }
		    System.out.println(); 
		}
		
	}
//output
//	1 2 3 4 5 
//	1 2 3 4 5 
//	1 2 3 4 5

}
