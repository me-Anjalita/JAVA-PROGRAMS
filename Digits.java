class Digits
{
public static void main(String[] args)
{
Digits dg=new Digits();
dg.count_of_digits(12345);
dg.find_palindrome(12321);
dg.find_sum_of_digits(2023);
}
void count_of_digits(int no)
{
int count=0;
while(no>0)
{ System.out.println(no%10);
  count=count+1;
  no=no/10;
}
System.out.println("The count of digits is "+ count);
}

void find_palindrome(int cake)
{
int no2=cake;
int reverse=0;
while(cake>0)
{
int rem=cake%10;
reverse=(reverse*10)+rem;
cake=cake/10;
}
if(reverse==no2)
 {
  System.out.println("It is a palindrome");
  }
else
  {
  System.out.println("It is not a palindrome");
  }


}
void find_sum_of_digits(int no)
{
int sum=0;
while(no>0)
{ 
 int rem=no%10;
 sum=rem+sum;
 no = no/10 ;
}
System.out.println("The sum of digits is" + sum);
}

}











