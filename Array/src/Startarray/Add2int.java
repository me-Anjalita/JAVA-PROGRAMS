package Startarray;

public class Add2int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30};
		int[] b= {10,20,30,40};
		int len=a.length>b.length? a.length:b.length;
		int[] c=new int[len];
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i]+b[i];
				
			}
			else   // no need of else condition if equal numbers if inputs are given in a and b array.
			{
				c[i]=b[i];
			}
			System.out.println(" "+c[i]);
		}

	}

}
//output
//20
//40
//60
//40

