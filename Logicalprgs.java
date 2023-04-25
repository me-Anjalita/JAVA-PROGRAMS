class Logicalprgs
{
public static void main (String[] args)
{
Logicalprgs lp = new Logicalprgs();
//lp.find_divisors(100);
//lp.find_count_of_divisors(120);
lp.find_prime(131);
}
//void find_divisors(int no)
//void find_count_of_divisors(int no)
void find_prime(int no) // no is 131
{
int div = 2; 
int count= 0;
//while(div<=no)
while(div<no)
{
  if(no%div == 0)
  {
  System.out.println(div);
  count=count+1;
  }
  div = div +1; 
  }
  System.out.println("no.of divisors is"+count); 
  if(count==0)
    {
        System.out.println("Given number is Prime Number");
    }
else
    {
        System.out.println("Given number is Not Prime Number");
    }


}

} 
