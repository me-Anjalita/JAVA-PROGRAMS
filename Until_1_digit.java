class Until_1_digit
{
public static void main(String[] args)
{
Until_1_digit sum_1=new Until_1_digit();
sum_1.findsum(1261);   // Incase if the input was 126 the output will be sum of digits : 9
}
void findsum(int no)
{
int sum=0;
while(no>0)
 {
  sum=sum+(no%10);
  no=no/10;
 }
  if(sum>=10)
  {
    System.out.println("No it does not give a single digit");
  }
  else
  {
    System.out.println("sum of digits : "+ sum);
  }

}

}
//output
//No it does not give a single digit


