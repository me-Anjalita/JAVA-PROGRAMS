package Startarray;

public class Twodimension { //Always two dimensional array can be handled only using more than one forloop or through nested forloop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twodimension ad = new Twodimension();
		ad.learning1();
		ad.learning2();
	}	

private void learning2() {
	// TODO Auto-generated method stub
	//JAGGED ARRAY
	 int[][] marks = new int[3][5];
	    marks[0] = new int[5]; //All these 5,6,and 4 indicates the number of subjects,so its respective lengths only will get printed.
	    marks[1] = new int[6];
	    marks[2] = new int[4]; 
	    System.out.println(marks.length);//length of array is getting printed
	    System.out.println(marks[0].length);
	    System.out.println(marks[1].length);
	    System.out.println(marks[2].length);


	  }
//OUTPUT
//3
//5
//6
//4
	
	


private void learning1() {
	// TODO Auto-generated method stub
			int[][] marks = new int[3][5];
		    //quarterly: 
		int exam = 0; 
		int subject = 0; 
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 98; subject++;
		    marks[exam][subject] = 100; subject++;
		    marks[exam][subject] = 65; subject++;
		    marks[exam][subject] = 78; subject++;
		    
		    //half yearly: 
		    exam++; 
		    subject = 0; 
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 92; subject++;
		    marks[exam][subject] = 99; subject++;
		    marks[exam][subject] = 100; subject++;
		    marks[exam][subject] = 95; subject++;
		    
		    //annual
		    exam++; 
		    subject = 0; 
		    marks[exam][subject] = 87; subject++;
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 95; subject++;
		    marks[exam][subject] = 98; subject++;
		    marks[exam][subject] = 93; subject++;
		    
		  exam = 0; 
		  System.out.println("Quarterly yearly marks");
		  for(subject=0; subject<5; subject++)
		  {
		    System.out.print(marks[exam][subject]+" ");
		  }
		  System.out.println();
		  exam++;
		  System.out.println("Half yearly marks");
		  for(subject=0; subject<5; subject++)
		  {
		    System.out.print(marks[exam][subject]+" ");
		  }
		  System.out.println();
		  exam++;
		  System.out.println("Annual marks");
		  for(subject=0; subject<5; subject++)
		  {
			
		    System.out.print(marks[exam][subject]+" ");
		  }
		  System.out.println(" ");
		  
		  int high=0;int examno=0;
		  for(exam=0;exam<3;exam++)
		  {
		  int total=0;//Each time total should be 0 i mean for each exams i.e why TOTAL writing it inside the forloop
		  for(subject = 0; subject<5; subject++)
		    {
		      total = total + marks[exam][subject];
		    }
		    System.out.println("Total is "+ total);
		    if(total>high)//431>0,476>431,463>476
		    {
		      examno=exam;//1
		      high = total; //high=431;high=476;high=476 so it still remains 476
		    }
		  }
		  System.out.println("Highest total is " + high + "in exam no:"+ examno);
		  
		  
			
		}
    
	  
	}


//OUTPUT
//Quarterly yearly marks
//90 98 100 65 78 
//Half yearly marks
//90 92 99 100 95 
//Annual marks
//87 90 95 98 93  
//Total is 431
//Total is 476
//Total is 463
//Highest total is 476in exam no:1
	  
	  
//	ANOTHER WAY TO DO
//	for(exam = 0; exam<3; exam++)
//	{
//		for(subject=0; subject<5; subject++)
//		{ 
//			if(marks[exam][subject]==100)
//	      {
//			System.out.println(exam);//this will print the index of which exam half yearly,quarter or annual
//	        System.out.println(subject);//this will print the index of which subject of that respective exams.
//		   }
//	    }  
//		System.out.println();
//	}

	  
	  
	  