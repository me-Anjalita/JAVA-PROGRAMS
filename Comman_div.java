class Comman_div
{
public static void main (String[] args)
{
Comman_div cm = new Comman_div();
cm.find_comman_divisors(100,120);  
cm.find_greatest_comman_divisor(100,120);
cm.find_least_comman_multiple(3,9);
//cm.while_break();
}

private void while_break() {
  int no1=10;
  int no2=12;
  int no=1;
  while(true)
  {
    System.out.println("Hi");
    no++;
    if(no==5)
      break;
    }
}


void find_comman_divisors(int no1, int no2) 
	{
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

void find_greatest_comman_divisor(int no1, int no2)
 {
 
  int div = 2; int gcd = 0; 
  int small = no1 < no2 ? no1: no2; 
  while(div<small)
  {
    if(no1%div==0 && no2%div==0)
    {
      gcd = div; 
    }
    div = div +1; 
  }
  System.out.println("GCD is "+ gcd);
  
}


void find_least_comman_multiple(int no1, int no2) 
{
  int div = 2; 
  int big = no1>no2?no1:no2;
  while(true) //not only conditions ,even true or false can be given . If this kind of t/f condition is given then BREAK statement is necessary . 
{
  if(big%no1 ==0 && big%no2==0)
  {
    System.out.println("LCM is "+ big);
    break; // the true condition will break once the lcm has been found
  }
  big = big+1; 
}

}
}
