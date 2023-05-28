package Startarray;

import java.util.Scanner; // this is necessary to avoid a error in the word scanner at 18th line . Ctrl shift O shortcut 

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraydemo ad=new Arraydemo();
		//ad.learn_array1();
		//ad.learn_array2();
		//ad.calculate_percentage();
		//ad.find_highest(); //This is to find the highest mark
		int[] marks = {92, 78, 89, 99,96}; //if all numbers are negative the answer will be 0 and 0.
	    //ad.find_second_biggest(marks);
	    ad.find_Second_smallest(marks);

	}

	private void find_Second_smallest(int[] marks) {
		// TODO Auto-generated method stub
		int small =Integer.MAX_VALUE, ssmall =Integer.MAX_VALUE; 
	    int i =0; 
	   
	    while(i<marks.length)
	    {
	    if(marks[i]<small)//92<max,78<92,89<78,99<78,96<78
	    {
	      ssmall = small;   //ss=max,ss=92,ss=89
	      small = marks[i]; //s=92,s=78,s=78
	    }
	    else if(marks[i]<ssmall) //89<92,99<89,96<78
	    {
	    ssmall = marks[i];  //ss=89,
	    }
	    i++; 
	    }
	    System.out.println("smallest is "+small);
	    System.out.println("Second smallest is "+ssmall);

	}

		
		
		

	private void find_second_biggest(int[] marks) {
		// TODO Auto-generated method stub
		int big =Integer.MIN_VALUE, sbig =Integer.MIN_VALUE; 
	    int i =0; 
	    //AutoBoxing
	Integer no = i; //variable got converted into object
	no.byteValue();
	    double d = no.doubleValue(); 
	//Auto Unboxing
	    int j = no; // object got converted into variable
	    while(i<marks.length)
	    {
	    if(marks[i]>big)
	    {
	      sbig = big; 
	      big = marks[i]; 
	    }
	    else if(marks[i]>sbig)
	    {
	    sbig = marks[i]; 
	    }
	    i++; 
	    }
	    System.out.println("Biggest is "+big);
	    System.out.println("Second Biggest is "+sbig);

	}

	private void find_highest() {
		// TODO Auto-generated method stub
		int[] marks = {96, 78, 89, 99, 92}; 
		String[] sub = {"Tamil", "English", "Maths", "Science",
		        "Social"}; // this is actually a next array which is printed using the index number.
		int index_h = 0; 
		int index_l =0; 
		int highest = marks[0]; //highest = 96
		int lowest = marks[0];
		int i=1; 
		while(i<marks.length)
		{
		  if(marks[i]>highest)
		  {
		    highest = marks[i]; 
		    index_h = i; //As we r finding the highest value its index number will get alloted to index_h to print the value of sub array.
		  }
		  if(marks[i]<lowest)
		  {
		    lowest = marks[i];
		    index_l = i;  //As we r finding the highest value its index number will get alloted to index_h to print the value of sub array. 
		   }
		  i++;
		}

		System.out.println("Highest mark is "+ highest + " from "+ sub[index_h]); // this sub[index_h] is for printing the value of index
		System.out.println("Lowest mark is "+ lowest + " from "+ sub[index_l]);
		}
	private void calculate_percentage() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Subjects? ");
	    int sub_count = sc.nextInt(); //5
	    int[] marks = new int[sub_count]; //to enter each subject marks
	    int total = 0; 
	    int i = 0; 
	    while(i<marks.length) //<5
	    {
	      System.out.println("Enter Mark ");
	      marks[i] = sc.nextInt(); 
	      total = total + marks[i];
	      i++; 
	    }
	    System.out.println("Your total is "+ total);
	    float percentage = total/sub_count;
	    System.out.println(percentage);
	  }
		
	

	private void learn_array2() {
		// TODO Auto-generated method stub
		int[] nandhini= {99,97,98,99,95,98};
		int i=0;
		while(i<6)  //while(i<nandini.length) Length-1 should be given if <= is given..this will be comfortable so it will directly take the length
		{
			// here any if condition can be given like greater than 80,print only centum.
		System.out.println(nandhini[i]);
		i++;
		}
	}

	private void learn_array1() {
		// TODO Auto-generated method stub
		int[] marks = new int[6]; //datatype of the value that we r giving
		marks[0]=100;
		marks[1]=90;
		marks[2]=80;
		System.out.println(marks[0]);
	    System.out.println(marks[1]);
	    System.out.println(marks[2]);
	    System.out.println(marks[3]);
	    System.out.println(marks[4]);
	    System.out.println(marks[5]);
//	    System.out.println(marks[6]);
		
	}

}
