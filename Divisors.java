class Divisors
{
public static void main(String[] args)
{
Divisors di=new Divisors();
di.find_divisor(10);
di.find_countdivisor(10);
}
void find_divisor(int no)
{
int div=1;
while(div<=no)
{
  if(no%div==0)
 {
  System.out.println(div);
 }
div=div+1; // this should come in while loop then only the increment of numbers will take place
  
}

}
//output
//1
//2
//5
//10

void find_countdivisor(int no)
{
int div=1;
int count=0;
while(div<=no)
{
 if(no%div==0)
 {
 System.out.println(div);
 count=count+1;
 }
div=div+1;
}
System.out.println("the count of divisors is"+ count);
 
}


}
