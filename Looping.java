class Looping
{
public static void main (String[] args)
{
Looping lp=new Looping();
lp.print_reverse(9697);
lp.find_count_of_digits(12345);   //this is like a new program to find how many numbers are there
lp.find_sum_of_digits(2023);
lp.reverse_a_no(1234);
lp.find_palindrome(12321);
}

void print_reverse(int cake) // cake is actually called as Method Local variable
{
  while(cake>0)
  {
  System.out.println(cake%10);
  cake=cake/10;
  }
}
//java Looping
//7
//9
//6
//9

void find_count_of_digits(int cake) // method signature statement 
{
    int count = 0; 
    while(cake>0)
    {
   // System.out.println(cake%10);
    count = count + 1; 
    cake = cake/10; 
    }
System.out.println("Count of Digits is "+ count);
// Count of Digits is 5. Output for the find the count of numbers 12345.
}
void find_sum_of_digits(int cake)
{
    int sum = 0; 
    while(cake>0)
    {
   // System.out.println(cake%10);
    int rem = cake%10; //rem 3,2,0,2
    sum = sum + rem; //sum==3
    cake = cake/10; 
     }
System.out.println("Sum of Digits is " + sum);  // Sum of Digits is 7

}
void reverse_a_no(int cake) //1234  // its not similar to reverse printing,in that every num is considered individually but in this considered together
{
    int reverse = 0;
    while(cake>0)   //123>0 12>0    1>0 
    {
    int rem = cake%10; //1
    reverse = (reverse * 10) + rem; //4 43  432 4321
    cake = cake/10; //0
     }
System.out.println("Reverse is " + reverse);
}
void find_palindrome(int cake) //12321
{   int no2 = cake; //line 12,22 no.s of line according to sir.
    int reverse = 0;
    while(cake>0)   
    {
    int rem = cake%10; 
    reverse = (reverse * 10) + rem; 
    cake = cake/10; 
     }
    
if(reverse == no2)
    {
    System.out.println("Palindrome"); 
    }
else
    {
    System.out.println("Not Palindrome"); 
    }
}

}


