private void find_common_divisors(int no1, int no2) 
	{
		  // TODO Auto-generated method stub
		  int div = 2; 
		  int small=no1 < no2? no1:no2; //this statement to know which number to assign in while loop .
		  while(div<small)     // directly give it as small
		  {
		    if(no1%div==0 && no2%div==0)
		    {
		      System.out.println(div);
		    }
		    div = div +1; 
		  }
		  
		}
