class Strong_no
{
public static void main(String[] args)
{
Strong_no sn = new Strong_no();
int num=145;
int result=sn.find_strong_no(num); // here num we have alloted,so below we should assign an other variable not the same one
System.out.println("The result of finding strong no is" + result);
if(num==result)
{
 System.out.println("The given number is Strong number");
}
else
{
 System.out.println("Not a strong number");
}
}

int find_strong_no(int no)
{
int sum=0;
while(no>0)
{
int rem=no%10; //5
sum=sum+factorial(rem);  //0+factorial(1*2*3*4*5)
no=no/10; //14
}
return sum;
}

int factorial(int fact) //5 then //4 then //1 factorial
{
int box=1;
int number=1;
while(number<=fact)
{
box=box*number;  //1*1,1*2,2*3,6*4,24*5,120
number=number+1;
}
return box;
}

}



