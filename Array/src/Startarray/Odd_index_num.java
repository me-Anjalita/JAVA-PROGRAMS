package Startarray;

public class Odd_index_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,22,33,44,55};
		//int oddindex=a.length/2;
		int[] b=new int[a.length/2]; //5/2 =2 ,in b array 2 empty box
		int i=1;
		int j=0;//6/2==3
		while(i<a.length)    //1<5
		{
			b[j]=a[i]; //b[0]=a[1];b[1]=a[3];
			i+=2; //to find odd +2
			j++;
		}
		System.out.println("printing odd index");
		for(int k=0;k<b.length;k++)   //k is index of b
		{
			System.out.println(b[k]+" ");
		}

	}	
}