class Febino extends Logicalprgs
{
public static void main(String[] args)
{
Febino fb=new Febino();
//fb.print_fibo();
//fb.print_fibo_without_thirdvari();
fb.print_fibo_prime();
}
void print_fibo() 
{
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
//output
//0 1 1 2 3 5 8 

private void print_fibo_without_thirdvari()
 {
  int p1 = 0, p2 =1; 
  while(p1<=21)
  {
	System.out.println(p1);
	p2 = p1 + p2; 
	p1 = p2 - p1; 
		    
   }
		  
		
 }
//output
//0
//1
//1
//2
//3
//5
//8
//13
//21

private void print_fibo_prime() 
{
 int p1 = 0, p2 =1; 
 Logicalprgs lp = new Logicalprgs();
 while(p1<=89)
{
  if(p1>1)
  lp.find_prime(p1);
  p2 = p1 + p2; 
  p1 = p2 - p1; 
		    
}
		  
}
		

}


