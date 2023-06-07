package Startarray;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {26,24,8,4,1};
		  //        0  1  2 3 4
		int key = 24; 
		int min = 0, max = ar.length-1;
		//min = 0    max = 4    mid = 2
		//min = 0    max = 1    mid = 0
		//min = 1   max = 1    mid = 1
		while(min<=max)
		{
		  int mid = (min+max)/2; //2
		  if(key==ar[mid])
		  {
		    System.out.println("Yes Present at "+ mid);
		    break;
		  }
		  else if(key>ar[mid]) //24>26
		  {
		    max = mid-1; //max = 1
		  }
		  else
		  {
		    min = mid+1; //min = 1
		  }

		}  //this if statement can also be given straight below the else statement . 
		if(min>max) //this is for printing the msg if we r giving a value that is not at all present in the array
		{
		  System.out.println("Key is not present");
		}

	}

}
