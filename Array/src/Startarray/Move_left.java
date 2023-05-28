package Startarray;

public class Move_left { //program for move towards left and move towards left twice

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40};
		       // 20,30,40,10
		//for(int j=1;j<=3; j++)  //j<=3 gives output till40 10 20 30..... j<=2 gives till 30,40,10,20 
		// and without this above forloop we will get output as 20,30,40,10
		{
		int i=0;
		int temp=a[i];  //a[i]=10
		while(i<a.length-1)
		{
			a[i]=a[i+1];   //a[0]=a[0+1],a[1]=a[1+1],a[2]=a[2+1]
			System.out.print(a[i] + " "); ///20,30,40
			i++;
			}
		a[i]=temp;   //a[3]=a[3+1]
		System.out.print(a[i] + "  "); //10
		

	}
}

}
//output
//20
//30
//40
//10 

