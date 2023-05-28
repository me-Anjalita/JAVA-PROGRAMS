class First_n
{
public static void main(String[] args)
{
First_n addno=new First_n();
addno.find_add_no();
}
void find_add_no()
{
int no=1;
int sum=0;
while(no<=10)
{
 sum=sum+no;
 no=no+1;
 
}
System.out.println("The sum of first n numbers is"+sum);

}

}
//output for <=10:
//The sum of first n numbers is55


//output for<10:
//The sum of first n numbers is45
