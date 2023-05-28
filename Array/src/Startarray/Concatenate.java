package Startarray;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {10,20,30};
		    int[] b = {40,50,60};
		    int[] c = new int[a.length+b.length];
		    for(int i=0;i<c.length;i++)
		    {
		      if(i<a.length) {
		        c[i]=a[i];
		      }else {
		        c[i]=b[i-a.length];
		      }
		      System.out.print(" " + c[i]);
		    }
		    
		  }

		}
		
//output
//10 20 30 40 50 60