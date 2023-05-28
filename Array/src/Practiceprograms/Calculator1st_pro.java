package Practiceprograms;

import java.util.Scanner;

public class Calculator1st_pro {
	int num1,num2,option,res;
	
		public static void main(String[] args) {
	
		Calculator1st_pro fpcObj =  new Calculator1st_pro();
	    	Scanner userinput =  new Scanner(System.in);
	    	int result;	char  Y_N;
		
		System.out.println("    FIRST PROJECT CALCULATOR      ");
		System.out.println("Enter the First number : \n ");
			fpcObj.num1= userinput.nextInt();
		System.out.println("Enter the Second number : \n ");
			fpcObj.num2= userinput.nextInt();
		
		do{	
			System.out.println("\n Arithmetic Calculations\n");
			System.out.println("Press 1 for Addition ");
			System.out.println("Press 2 for Substraction ");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Which operation you want to do pls select between 1 & 4");
				fpcObj.option= userinput.nextInt();
				result= fpcObj.caclulator(fpcObj.option);
			System.out.println("Do you want to exit Y/N? ");
			 Y_N = userinput.next().charAt(0);
			
			if(Y_N=='Y' ||Y_N=='y')
			{
				System.out.println("Thank you ,Bye for now!!!");
				break;
			}
			else if(Y_N=='N' || Y_N=='n')
			{
				fpcObj.num1=result;
				System.out.println("The first number to do calculation : " + result);
				System.out.println("Enter the Second number to do calculation:");
				fpcObj.num2=userinput.nextInt();
			}
		
		}while(true);
				
	}
	private int caclulator(int option) {
	
		switch(option)
		{
			case 1:
				res = num1+num2;
				System.out.println("The addition of given numbers \n  " + res);
				break;
			case 2:
				res = num1-num2;
				System.out.println("The substraction of given numbers \n  " + res);
				break;
			case 3:
				res = num1*num2;
				System.out.println("The multiplication of given numbers \n  " + res);
				break;
			case 4:
				res = num1/num2;
				System.out.println("The divison of given numbers \n  " + res);
				break;
			default:
				System.out.println("Enter the valid number between 1&4");
		}
		return res;
	}
}
