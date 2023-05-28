package Startarray;

public class Reverse_anjali { //copying array to an other new array in reverse order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]a= {'a','n','j','a','l','i'};
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
			
		
			
		}
		
		for(int b=0;b<a.length;b++)
		{
			System.out.print(a[b]);
		}
		

	}

}
