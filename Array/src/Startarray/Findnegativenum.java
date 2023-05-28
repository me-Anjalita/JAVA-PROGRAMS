package Startarray;

public class Findnegativenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,-30,-10,-50};
		int i=0;
		int count=0;
		while(i<a.length)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
				count++;
				
			}
			i++;
			
			
		}
		System.out.println("The number of negative numbers in the array is" + count);
		

	}

}
//output 
//-30
//-10
//-50
//The number of negative numbers in the array is3

