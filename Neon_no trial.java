class Neon_no
{
public static void main(String[] args)
{
Neon_no ne=new Neon_no();
int result= ne.find_square(9,2);
int result2 = ne.find_addition_of_digits(81);
}
int find_square(int base, int power)
{
int box = 1; 
while(power>0)
{
box = box * base; 
power = power - 1; 
}
return box; 
}

int find_addition_of_digits(int no)
{
int addition = 0; 
while(no>0)
{
int rem = no%10; 
addition = addition + rem; 
no = no/10; 
}
return addition; 
}

//int result = ne.find_square(base, power); 
//int result2 = ne.find_addition_of_digits(result);
if(base == result2)
  {
  System.out.println("Neon Number");
  }
else
  {
   System.out.println("Not a Neon Number");
  }
}
