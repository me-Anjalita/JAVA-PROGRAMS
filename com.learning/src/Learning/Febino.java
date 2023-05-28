package Learning;

public class Febino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Febino fb=new Febino();
//		fb.print_fibo();
//		fb.print_fibo_without_thirdvari();
		fb.print_fibo_prime();
//		fb.find_sqr_root(81);
	}

	private void print_fibo_prime() {
		// TODO Auto-generated method stub
		 int p1 = 0, p2 =1; 
		    LogicalPrograms lp = new LogicalPrograms();
		    while(p1<=89)
		    {
		    	if(p1>1)
		          lp.find_Prime(p1);
		          p2 = p1 + p2; 
		          p1 = p2 - p1; 
		    
		    }
		  }
		
	

	private void find_sqr_root(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		while(div<no)
		{
		if(no/div == div)
		{
			System.out.println(div);
			break; 
		}
		div++;
		}
		
	}
//	9 output.

	private void print_fibo_without_thirdvari() {
		// TODO Auto-generated method stub
		 int p1 = 0, p2 =1; 
		    while(p1<=21)
		    {
		    System.out.println(p1);
		    p2 = p1 + p2; 
		    p1 = p2 - p1; 
		    
		    }
		  
		
	}
//	0
//	1
//	1
//	2
//	3
//	5
//	8
//	13
//	21

	private void print_fibo() {
		// TODO Auto-generated method stub
		int p1=0;
		int p2=1;
		while(p1<=8)
	    {
	    System.out.print(p1+" ");//the output will move to p1 in next step so that will be considered a output and will be printed.
	    int p3 = p1 + p2;  
	    p1 = p2;
	    p2 = p3; 
	    }
	  }
		
		
}
//0 1 1 2 3 5 8 


