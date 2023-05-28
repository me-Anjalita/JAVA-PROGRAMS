package Startarray;

public class Copynegativenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,-10,-20,30,40,-50};
		int count=0;
		int i=0;
		int j=0;
		int[] b=new int[a[j]];
		while(i<a.length)
		{
			if(a[i]<0)
			{
				
				//System.out.println(a[i]);
				b[j]=a[i];
				count++;
				j++;
				
			}
			
			i++;
		}
		System.out.println("The number of negative numbers is"+ count);
		System.out.println("New array of negative num is");
		for(j=0;j<count;j++)    //here we r using a loop to print a new list of arrays. That is from list of 6 numbers we r getting 3 out of it so new array new loop.But in concatenation we used only 1 loop becoz the list of numbers is same in those arrays.
		{ 
			System.out.println(b[j]);
			
		}
		
		
		

	}

}
