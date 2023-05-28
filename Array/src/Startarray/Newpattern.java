package Startarray;

public class Newpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Newpattern p1=new Newpattern();
		//Newpattern p2=new Newpattern();
		//Newpattern p3=new Newpattern();
		//Newpattern p4=new Newpattern();
		//Newpattern p5=new Newpattern();
		//Newpattern p6=new Newpattern();
		//Newpattern p7=new Newpattern();
		//Newpattern p8=new Newpattern();
		//Newpattern p9=new Newpattern();
		Newpattern p10=new Newpattern();
		
		
		
		//p1.print_c();
		//p2.print_E();
		//p3.print_O();
		//p4.print_8();
		//p5.print_T();
		//p6.print_Y();
	    //p7.print_v();
		//p8.print_I();
		//p9.print_Z();
		p10.print_X();
		
		

	}

	private void print_X() {
		// TODO Auto-generated method stub
		 for(int row=1; row<=9;row++)
		    {
		      if(row<=9) //1<=5; 2<=5;n3<=5; 4<=5; 5<=5 [This is to print for 5 rows]  
		      {
		        for(int col=1; col<=9;col++)
		        {
		          if(col==row || col==10-row) // || -OR(both should happen)
		          {
		            System.out.print("* ");//col=1---> *,col=10-1---> *
		          }
		          else
		            System.out.print("  ");//col=2---> SPACE  "TILL" col=8--->SPACE
		        }
		        System.out.println();//Comes to next line and row will be ++ 
		      
		        }
	        }
	}

	private void print_Z() {
		// TODO Auto-generated method stub
		int num=1;
	    for(int col=1; col<=9; col++) //1<=9,2<=9, 3<=9, 4<=9, 5<=9, 6<=9,7<=9, 8<=9,9<=9, 10<=9
	      {
	      System.out.print("*"+" "); // * , *, *, *, *, *, *, *, *, at the last case the loop brakes and will move to next line
	      }
	  System.out.println(); //moves to next line
	  for(int star=1; star<=7; star++)  //1<=7
	      {
	      for(int space=1; space<9-num; space++) //1<9-1, 2<9-1, 3<9-1, 4<9-1, 5<9-1, 6<9-1, 7<9-1, 8<9-1
	    	                                     //1<9-2, 2<9-2, 3<9-2, 4<9-2, 5<9-2, 6<9-2,7<7
	          {
	          System.out.print("  "); // " "," "," "," "," "," "," ",at the 8th position this wont workout 
	                                  // " "," "," "," "," "," "," ",at the 7th position this wont workout 
	          }
	      System.out.println("*"); //so at 8th position * will get printed
	                               //so at 7th position * will get printed
	      num++; //once the * gets printed ,num will get incremented
	      
	  }
	  for(int col=1; col<=9; col++)
	    {
	    System.out.print("*"+" ");//nine * will get printed till 10<=9
	    }
	System.out.println(); //at 10<=9 it will movd to next lind
	  }
//output
//	* * * * * * * * * 
//				   *
//				 *
//			   *
//			*
//		*
//	*
//*
//* * * * * * * * * 

	  
		
	

	private void print_I() {
		// TODO Auto-generated method stub
		 for(int col=1; col<=9; col++)
	      {
	      System.out.print("*"+" ");
	      }
	  System.out.println(); 
	  for(int star=1; star<=7; star++)
	      {
	      for(int space=1; space<=4; space++)
	          {
	          System.out.print("  ");
	          }
	      System.out.println("*"); 
	  }
	  for(int col=1; col<=9; col++)
	    {
	    System.out.print("*"+" ");
	    }
	System.out.println();
		
	}
//output
//	   * * * * * * * * * 
//		     *
//		     *
//		     *
//		     *
//		     *
//		     *
//		     *
//	    * * * * * * * * * 
	

	private void print_v() {
		// TODO Auto-generated method stub
		for(int row=1; row<=9;row++)
		{
			if(row<=5) {
			for(int col=1; col<=9;col++)
			{
				if(col==row || col==10-row)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			}
		}
	}
//output
	
//	*               * 
//	  *           *   
//	    *       *     
//	      *   *       
//	        *         

	private void print_Y() { //DOUBT
		// TODO Auto-generated method stub
		 for(int row=1; row<=9;row++)
		    {
		      if(row<=5) //1<=5; 2<=5;n3<=5; 4<=5; 5<=5 [This is to print for 5 rows]  
		      {
		        for(int col=1; col<=9;col++)
		        {
		          if(col==row || col==10-row) // || -OR(both should happen)
		          {
		            System.out.print("* ");//col=1---> *,col=10-1---> *
		          }
		          else
		            System.out.print("  ");//col=2---> SPACE  "TILL" col=8--->SPACE
		        }
		        System.out.println();//Comes to next line and row will be ++ 
		      }
		      else //6<=5; 7<=5; 8<=5; 9<=5; 10<=5 
		      {
		        for(int space=1; space<=4; space++)
		        {
		          System.out.print("  ");
		        }
		      System.out.println("*"); //And when its 10<=5 loop will break and execution will stop.
		      }
		      
		    }
		    
		
	}
//output
//	*               * 
//	  *           *   
//	    *       *     
//	      *   *       
//	        * //5<=5 star will get printed    
//	        *
//	        *
//	        *
//	        *


	private void print_T() { //DOUBT
		// TODO Auto-generated method stub
		for(int star=1; star<=5; star++)
	    {
	    System.out.print("*"+" "); //instead of just giving space at " " ,we can also  give "/t"
	    }
	System.out.println(); 
	for(int star=1; star<=7; star++)
	    {
	    for(int space=1; space<=2; space++) //1<=2,2<=2
	        {
	        System.out.print(" "+ " ");    //SPACE,SPACE
	        }
	    System.out.println("*"); //After the space at 3rd place star will get printed,
	}   //And since we have given println it will print * downwards till 7<=7
	
		
			}
//output
//  * * * * * 
//      *
//      *
//      *
//      *
//      *
//      *
//      *

	  
	


	private void print_8() {
		// TODO Auto-generated method stub
		for(int col=1; col<=7; col++)
	      {
	      if(col==1)//so as usual at first position its a space
	          System.out.print("  "); 
	      else
	          System.out.print("* "); //From the 2nd position onwards * will get printed (6 stars will get printed) 
	      }
	    System.out.println();//moves to next line
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); //at the 1st position * will be printed
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");//this line means that for almost 6 position 6 spaces should be there
	        }
	      System.out.println("*"); //at the end of 6th position * should be printed
	      }//same way it happens for each 7 star 
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)//again a line is to be printed with stars
	          System.out.print("  "); //1st position will be space
	      else
	          System.out.print("* "); //and then 6 stars will be printed
	      }
	    System.out.println();
	    for(int star=1; star<=7; star++)//And again the same thing happens for printing a "O" below that "O"
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	    for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
		
	    //THE SAME STEP HAPPENS FOR PRINTING THE NEXT PART OF "8"
		
	}
//output
//      * * * * * * 
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	    * * * * * * 
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	    * * * * * * 
	private void print_O() {
		// TODO Auto-generated method stub
		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); //at first position its a space
	      else
	          System.out.print("* "); //From the 2nd position onwards * will get printed (6 stars will get printed)   
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++) //this line means for 6 spaces empty space will be printed
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); //after the six spaces print the star straight at the end
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); //Again at the bottom staring 1 space will be printed
	      else
	          System.out.print("* "); //and then 6 stars will be printed
	      }
	    
		
	}
//output
//	    * * * * * * 
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	  *             *
//	    * * * * * * 

	private void print_E() {
		// TODO Auto-generated method stub
		  for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print(" "); //In the first position only space
	      else
	          System.out.print("* "); //from the second position * will get started to print(6 starts)
	      }
	    System.out.println();//moves to next line total of 7 starts vetrically will get printed
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); //total of 7 starts vetrically will get printed
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); //one space at the first position
	      else
	          System.out.print("* "); //* will start to get printed from the 2nd position(6 stars)
	      }
	    System.out.println(); 
	    for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); //again total of 7 starts vetrically will get printed
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); //again In the first position only space
	      else
	          System.out.print("* "); //from the second position * will get started to print(6 starts)
	      }
	    
		
	}
//output
//	  * * * * * * 
//	  * 
//	  * 
//	  * 
//	  * 
//	  * 
//	  * 
//	  * 
//	    * * * * * * 
//	  * 
//	  * 
//	  * 
//	  * 
//	  * 
//	  * 
//	  * 
//	    * * * * * * 

	private void print_c() {//Each loop will get completed then only it will move to the next for loop
		// TODO Auto-generated method stub
		for(int col=1; col<=7; col++)
	    {
	    if(col==1)
	        System.out.print("  "); //after if condition works out,it moves again to the forloop i.e in 361 line.
	    else
	        System.out.print("* "); 
	    }
		System.out.println();
	for(int star=1; star<=7; star++)//And1 more doubt will it move to 372 line or will go for star++ 
	    {
	    System.out.println("* "); //Giving println will print downwards,if u r giving print it will print straight 7 stars
	    }
	for(int col=1; col<=7; col++)//This is to print the last line of 6 stars
	    {
	     if(col==1)
	        System.out.print("  "); //At first instead of * there will be space
	    else
	        System.out.print("* "); //From col==2 it will start to print 6 *'s
	    }
		
	}

}
//output:It prints the letter "C"
//	  * * * * * * 
//	* 
//	* 
//	* 
//	* 
//	* 
//	* 
//	* 
//	  * * * * * * 
