package Startarray;

public class Reversestalin { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] name = {'s','t','a','l','i','n'}; 
	    int i = 0, j = name.length-1; 

	    while(i<j)
	    {
	    char temp = name[i]; 
	    name[i] = name[j];  //this means that the last charachter will be assigned to its 1 st index and so on;
	    name[j] = temp; 
	    i++; //0,1,2,3,4,5,
	    j--; //5,4,3,2,1,
	    }

	    for(int k=0; k<name.length; k++) //this k is to print the new array i.r the reversed name of stalin
	    {
	    System.out.print(name[k]+" "); 
	    }
	    
	  }

	}


