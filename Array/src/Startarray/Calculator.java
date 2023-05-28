package Startarray;

import java.util.Scanner;

public class Calculator {


		  public static void main(String[] args) {
		    // TODO Auto-generated method stub
			  Scanner calc=new Scanner(System.in);
			  Calculator call=new Calculator();
				int no1;
				int no2;
				int final_value;
				System.out.println("enter first number");
				no1=calc.nextInt();
				System.out.println("enter second number");
				no2=calc.nextInt();
				char operator=calc.next().charAt(0); //charAt() method takes the integer value as argument which is nothing but index value for character array.It means that it will consider from the index number we give like 0,1,2. 
				//And if we give 2 as the inside value then we wont be able to access the 0,1th index operators i.e +,- .
				
				if (operator=='+')
				{
					final_value=(no1+no2);
					System.out.println("Answer:"+final_value);
				}
				else if(operator=='-')
				{
					final_value=(no1-no2);
					System.out.println("Answer:"+final_value);
				}
				else if(operator=='*')
				{
					final_value=(no1*no2);
					System.out.println("Answer:"+final_value);
				}
				else if(operator=='/')
				{
					final_value=(no1/no2);
					System.out.println("Answer:"+final_value);
					
				}
				else {
				
					System.out.println("This operator is not yet implemented");
					
		         
		
				void continuation(res) 
				{
					 Scanner sc = new Scanner(System.in);
					 System.out.println("Do you want to continue ? [Y/N] :");
					 char ch = sc.next().charAt(0);
					    if(ch=='Y' || ch=='y') {
					    	System.out.println("Enter new input : ");
					    	int num2 = sc.nextInt();
					    	calc(res,num2);
					    }else if(ch=='n' || ch=='N') {
					    	System.out.println("Thank you for using!!");
					    }
					    else {
					    	System.out.println("Invalid input ! Try again");
					    	continuation(final_value);
					    }
				 

		
		
				
				
				
				

			}
		  
		


		  