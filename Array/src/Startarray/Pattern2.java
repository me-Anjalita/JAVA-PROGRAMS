package Startarray;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern2 p2=new Pattern2();
		//Pattern2 p3=new Pattern2();
		//Pattern2 p4=new Pattern2();
		//Pattern2 p5=new Pattern2();
		//Pattern2 p6=new Pattern2();
		//Pattern2 p7=new Pattern2();
		//Pattern2 p8=new Pattern2();
		//Pattern2 p9=new Pattern2();
		//Pattern2 p10=new Pattern2();
		//Pattern2 p11=new Pattern2();
		//Pattern2 p12=new Pattern2();
		//Pattern2 p13=new Pattern2();
		Pattern2 p14=new Pattern2();
		
		
		
		//p2.pattern1();
		//p3.pattern2();
		//p4.pattern3();
	    //p5.pattern4();
		//p6.pattern5();
		//p7.pattern6();
		//p8.pattern7();
		//p9.pattern8();
		//p10.pattern9();
		//p11.pattern10();
		//p12.pattern11();
		//p13.pattern12();
		p14.pattern13();
		
		

	}

	private void pattern13() {
		// TODO Auto-generated method stub
		for(char row = 'E'; row>='A'; row--)
	    {
	      for(char star='A'; star<='E'-row; star++)
	        {
	        System.out.print("  ");
	        }
	    for(char col='A'; col<=row; ++col)
	        {
	        System.out.print(col+"   "); 
	        }
	    System.out.println(); 
	    }
		
	}
//output
//	A   B   C   D   E   
//	A   B   C   D   
//	A   B   C   
//	A   B   
//	A   


	private void pattern12() {
		// TODO Auto-generated method stub
		for(int row = 5; row>=1; row--)
		{
			for(int star=1; star<=5-row; star++) //1<=0;1<=1;1<=2;1<=3;1<=4
				{
				System.out.print("  ");//at first no space; 1space; 2 space; 3 space; 4space
				}
		for(int col=1; col<=row; ++col)
		    {
		    System.out.print(col+" "); 
		    }
		System.out.println(); 
		}

		
	}
		
//OUTPUT
//	1 2 3 4 5 
//	  1 2 3 4 
//	    1 2 3 
//	      1 2 
//	        1 


	private void pattern11() {
		// TODO Auto-generated method stub
		for(int row = 5; row>=1; row--) //row=5 tells on how many rows we want 
		{
		for(int star=1; star<row; star++)//1<5
		    {
		    System.out.print("  ");//so this line will print 4 spaces before printing num
		    }
		for(int num = row; num<=5; num++)//here num=5,5<=5; num=4,4<=5; num=3,3<=5; num=2,2<=5; num=1,1<=5
			{
			System.out.print(num+" ");//5, 4 5,  3 4 5,  2 3 4 5,  1 2 3 4 5
			}
		System.out.println(); //this line is to move to next line
		} 
		
	}
//output
//	     5 
//     4 5 
//   3 4 5 
// 2 3 4 5 
//1 2 3 4 5 

	private void pattern10() {
		// TODO Auto-generated method stub
		for(int row = 5; row>=1; row--) //here row=5, means 5 rows needs to be printed
		{
		    for(int star =1; star<row; star++)//s=1,s<5; s=2,s<5; 
		    {
		    System.out.print("  ");
		    }
		    for(int no = 5; no>=row; no--)//5>=5,5>=4,5>=3
		    {
		    System.out.print(no+" "); //5; 5 4; 5 4 3; 5 4 3 2; 5 4 3 2 1. 
		    }  
		    System.out.println(); 
		}

		
	}
//OUTPUT
//	     5
//     5 4
//   5 4 3
// 5 4 3 2
//5 4 3 2 1  

	private void pattern9() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
		
		for(int col=1;col<=row;col++)
//here we r giving col<=row but if we give col<=5 we will get the same output for 5 lines becoz the effect of row -- will not be applicable
		{
			if(col%2!=0) //1%2!=0,  3%2!=0,  
			{
				System.out.print(1+ " ");
			}
			else      //2%2=0,  4%2!=0
			{
				System.out.print(0+ " ");
			}
			
		} 
		System.out.println();
	}
		
		
		
	}
//output
//	1 0 1 0 1
//	1 0 1 0
//	1 0 1
//	1 0
//	1

//output : When we given col<=5.
//	1 0 1 0 1 
//	1 0 1 0 1 
//	1 0 1 0 1 
//	1 0 1 0 1 
//	1 0 1 0 1 


	private void pattern8() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		    for(int star = 1; star<no; star++)
		    {   
		    	System.out.print(" ");  //just remove the star from here and add space 
		    }
		    for(int num=1;num<=6-no;num++)  //1<=6-5-->1<=1 ;  1<=6-4--->1<=2
		    {
		    System.out.print(num+""); //giving a space over here will bring that output
		    }
			System.out.println();
	}
		
		
	}
//output:just changing 1+" " to num+" "
	
//    1  
//   1  2  
//  1  2  3  
// 1  2  3  4  
//1  2  3  4  5  
	
//output : This output also possible if we reduce the space in num+ ""
//	    1
//	   12
//	  123
//	 1234
//	12345

	
//output: This output when we try changing num+" " into no+" "
//    5  
//   4  4  
//  3  3  3  
// 2  2  2  2  
//1  1  1  1  1  

	private void pattern7() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		    for(int star = 1; star<no; star++)
		    {   
		    	System.out.print(" ");  //just remove the star from here and add space 
		    }
		    for(int num=1;num<=6-no;num++)
		    {
		    System.out.print(1+"  "); //giving a space over here will bring that output
		    }
			System.out.println();
	}
		
		
		
	}
//output
//    1 
//   1 1 
//  1 1 1 
// 1 1 1 1 
//1 1 1 1 1 
	
//output: again giving a extra space at 1+"  " will give this output
//    1  
//   1  1  
//  1  1  1  
// 1  1  1  1  
//1  1  1  1  1  

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		    for(int star = 1; star<no; star++)
		    {   
		    	System.out.print("");  //just remove the star from here and add space 
		    }
		    for(int num=1;num<=6-no;num++)
		    {
		    System.out.print(1+"");
		    }
			System.out.println();
	}
		
		
		
	}
//output: By adding space in between after removing the star
//    1
//   11
//  111
// 1111
//11111
	
//output: Without adding space in between after removing the star
//	1
//	11
//	111
//	1111
//	11111

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		    for(int star = 1; star<no; star++) // 1<5; 1<4; 1<3; 1<2; 1<1
		    {   
		    	System.out.print("*");  // * * * * ; * * * ; * * ; *
		    }
		    for(int num=1;num<=6-no;num++) //this will print "1" in increasing order at the end of each line
		    { //1<=1; 1<=2; 1<=3; 1<=4; 5<=5
		    System.out.print(1+"");
		    }
			System.out.println();
	}
		
		
	}
//output
//	* * * * 1 
//	* * * 1 1 
//	* * 1 1 1 
//	* 1 1 1 1 
//	1 1 1 1 1 

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		    for(int star = 1; star<no; star++)
		    {   
		    	System.out.print("*");  
		    }
		    for(int num=1;num<=5;num++)
		    {
		    System.out.print(1+""); //this will print 5 "1"'s at the end
		    }
			System.out.println();
	}

//* * * * 1 1 1 1 1 
//* * * 1 1 1 1 1 
//* * 1 1 1 1 1 
//* 1 1 1 1 1 
//1 1 1 1 1 
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		    for(int star = 1; star<no; star++)
		    {   
		    	System.out.print("* ");  
		    }
		    System.out.println(1);  //This line will help in printing 1 at the end befpre moving to the next line......
		    System.out.println();
		    }
	}
//output
//	* * * * 1
//	* * * 1
//	* * 1
//	* 1
//	1    this line tells that there is a star at the end that is why 1 is printed at the end

		
		//DOUBT
	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5; row++)  //r=1 ,1<=5
		{
		    for(int coloum = 1; coloum<=row; coloum++) // 1<=1,1<=2,1<=3,1<=4,1<=5
		    {
		    System.out.print(coloum+" "); // 
		    }
		    System.out.println(); //moves to next line
		}
		
	}

	
		
//output:here they have printed coloum
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 


	private void pattern1() { //IMAGENARY STAR
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		    for(int star = 1; star<no; star++) //Here we r giving star<no it  means print 1,2,3,4 only becoz its given less than 5.
		    {   
		    	System.out.print("* ");  
		    }
		    System.out.println();
		    
		}
	}
}	
	
	
		     
	
//here there is a empty star at the end which is not visible.
//* * * * 
//* * * 
//* * 
//* 



	
	
