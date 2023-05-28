package Startarray;

public class Add_odd_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};  // 10-1,20-2,30-3,40-4,50-5.......
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0);
			{
				total=total+a[i];   //0+10+30+50=90
			}
			i++;
		}
		System.out.println("The total of odd numbers in the given array is " + total);

	}

}

//output
//The total of odd numbers in the given array is 90