package Startarray;

public class Stringdemo12_con3 {//program for frequency or count of each charachter
//THINGS THAT ARE POSSIBLE TO FIND IN THIS 1 WHOLE PROGRAM
//Count or frequency of each charachter
//Non repeated charachter
//Repeated charachters
//Most frequent char in a given string.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stringdemo12_con3 sd=new Stringdemo12_con3();
		Stringdemo12_con3 sd_max=new Stringdemo12_con3();
		//sd.check_count_of_charachter();
		sd_max.check_max_count();
		
		
		

	}
   private void check_max_count() {
		// TODO Auto-generated method stub
	   String n = "sivasabaribala";
	   int[] cc=new int[n.length()];
	   int big=-1; int position=-1;//these are the two things we should know,
		
	   for(int j=0; j<n.length();j++)//j=0 it means considering the first letter s
		{	   
		    int count = 1; //its starting count will be 1 
		    char ch = n.charAt(j);//this charAt value given should be considered,that is the letter that must be checked
		    for(int i=j+1; i<n.length();i++) //here the checking starts from the next index of charAt()
		    {
		    	
		      if(ch == n.charAt(i))
		      {
		    	cc[i]=-1;//if matching is found -1 will be written at the secondly arrived letter.
		        count++; //along with mentioning -1 ,increment of count will also happen.
		      }
		    }
		    if(cc[j]!=-1)//if the checked letter is not mentioned -1 then update me the count of that letter here.
		    {
		    	cc[j]=count;
		    	if(count>big)//checking whether count>big
		    	//2>-1,1>2,2>1,5>2
		    	{
		    		big=count;//at first it will 2 then ,then 1 wont get assigned  straightly will wait for assigning 5
		    		position=j;//and its respective position
		    	}
		    }  
		    //if(cc[j]>0) {//if its >0 i.e its not -1 then print it
	
		    System.out.println(ch + " appears for " + cc[j] + 
		        " times");
		    
		    }  
		    System.out.println(position+" position appears maximum time"+big);
		  //}
	
   }
	
  //FINAL OUTPUT
//   s appears for 2 times
//   i appears for 2 times
//   v appears for 1 times
//   a appears for 5 times
//   s appears for -1 times
//   a appears for -1 times
//   b appears for 2 times
//   a appears for -1 times
//   r appears for 1 times
//   i appears for -1 times
//   b appears for -1 times
//   a appears for -1 times
//   l appears for 1 times
//   a appears for -1 times
//   3 position appears maximum time5

private void check_count_of_charachter() {
		// TODO Auto-generated method stub
		   String n = "sivasabaribala";
		   int[] cc=new int[n.length()]; //creating a new array called cc with same length
		   
		   
		for(int j=0; j<n.length()-1;j++)//j=0 it means considering the first letter s
		{	   
		    int count = 1; //its starting count will be 1 
		    char ch = n.charAt(j);//this charAt value given should be considered,that is the letter that must be checked
		    for(int i=j+1; i<n.length();i++) //here the checking starts from the next index of charAt()
		    {
		    	
		      if(ch == n.charAt(i))
		      {
		    	cc[i]=-1;//if matching is found -1 will be written at the secondly arrived letter.
		        count++; //along with mentioning -1 ,increment of count will also happen.
		      }
		    }
		     if(cc[j]!=-1)//if the checked letter is not mentioned -1 then update me the count of that letter here.
		    {
		    	cc[j]=count;
		    }  
		    if(cc[j]>0) {//if its >0 i.e its not -1 then print it
	
		    System.out.println(ch + " appears for " + cc[j] + 
		        " times");
		    
		    }  
		  }
	}
		
}
//output: when we give charAt(0) and i=1
             //it means "s" letter, i=1 means from the next letter onwards i.e index 1 

//s appears for 2 times

//output:when we give charAt(3) and i=4

//a appears for 5 times

//FINAL OUTPUT
//s appears for 2 times
//i appears for 2 times
//v appears for 1 times
//a appears for 5 times
//b appears for 2 times
//r appears for 1 times
//l appears for 1 times