package Startarray;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,7, 3,1};   //In this given number of arrays 3 times forloop should be used and executed to get 1,3,7,10
		  for(int i=0; i<ar.length;i++)
		  {
		    System.out.print(ar[i]+" "); //this is to print the array of numbers that is given
		  }
		  System.out.println();
		  for(int i=0; i<ar.length-1;i++)
		  {
		    if(ar[i]>ar[i+1])//10>7; 10>3; 10>1; 10>10
		    {
		      int temp = ar[i]; //10;10;10
		      ar[i] = ar[i+1]; // 7;3;1;10
		      ar[i+1] = temp; 
		    }
		  }
		  System.out.println("After First Swap");
		  for(int i=0; i<ar.length;i++)
		  {
		    System.out.print(ar[i]+" ");// Here the new array will be printed i.e 7 3 1 10
		  }

		  for(int i=0; i<ar.length-2;i++)  //we r giving length-2 becoz the number 10 is placed in the correct position hence no need to consider that number in this forloop 
		  {
		    if(ar[i]>ar[i+1])
		    {
		      int temp = ar[i]; 
		      ar[i] = ar[i+1]; 
		      ar[i+1] = temp; 
		    }
		  }
		  System.out.println();
		  System.out.println("After Second Swap");
		  for(int i=0; i<ar.length;i++)
		  {
		    System.out.print(ar[i]+" ");
		  }
		  

		
		for(int i=0; i<ar.length-3;i++)  //we r giving length-3 becoz the number 10 and 7 is placed in the correct position hence no need to consider that number in this forloop 
		  {
		    if(ar[i]>ar[i+1])
		    {
		      int temp = ar[i]; 
		      ar[i] = ar[i+1]; 
		      ar[i+1] = temp; 
		    }
		  }
		  System.out.println();
		  System.out.println("After Third  Swap");
		  for(int i=0; i<ar.length;i++)
		  {
		    System.out.print(ar[i]+" ");
		  }
	
		
}


}
