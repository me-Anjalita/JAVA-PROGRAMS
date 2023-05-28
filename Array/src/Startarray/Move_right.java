package Startarray;

public class Move_right { //moving towards right in given array and moving right twice

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40};
			    //40,10,20,30,
		for(int j=1;j<=3; j++) 
		{
		//int len=a.length;
		int i=a.length-1;  //4-1=3
		int temp=a[i];  //a[i]=a[3].... so 40 will be assigned to temp
		while(i>0)  //3>0,2>0,1>0, 0>0
		{
			a[i]=a[i-1];   //a[3]=a[3-1],a[2]=a[2-1],a[2]=a[2+1]
			//a[3]=30,a[2]=20,a[1]=10,
			i--;
			}
		a[i]=temp;   //a[0].... here i's value is 0
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k] + "  "); //10
		}
		
		

	}
}


	}


//output
//30 20 10 40  
