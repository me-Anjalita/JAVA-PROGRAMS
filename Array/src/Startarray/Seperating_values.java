package Startarray;

import java.util.Scanner;//give ctrl spacebar at scanner

public class Seperating_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //will ask inputs from us in the output
	    // (48,85,79,99,89). This scanner class can also be used if the array of numbers is not given
	      int[] marks = {48,85,79,99,89}; 
	      int i = 0;
	      while(i<marks.length) {
	         
	            System.out.print(marks[i] + " ");  
	            int b=marks[i]%10;//8,
	      int a=marks[i]/10;//4,
	      if(a<b){
	        System.out.println("the given number a<b condition satisfied:"+marks[i]);      
	        }
	      else {
	             System.out.println("The given no a<b not satisfied ");
	      }
	      i++;
	      }
		

	}

}
//output
//48 the given number a<b condition satisfied:48
//85 The given no a<b not satisfied 
//79 the given number a<b condition satisfied:79
//99 The given no a<b not satisfied 
//89 the given number a<b condition satisfied:89
