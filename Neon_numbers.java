class Neon_numbers
{
public static void main(String[] args)
{
Neon_numbers nb= new Neon_numbers();
nb.find_neon();
}
void find_neon()
{
int no=9;
int sum=0;
int square=no*no;
int square1=square;
while(square>0)
{ 
int rem= square%10;
sum=sum+rem;
square=square/10;
}
if(sum==no)
{
 System.out.println("Given no is neon number");
}
else
{
  System.out.println("Given no is not a neon number");
}

}

}

