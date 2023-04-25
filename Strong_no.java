class Strong_no
{
public static void main(String[] args)
{
Strong_no sn = new Strong_no();
int num=145;
sn.factorial();
int result=sn.find_strong_no(num);
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

int find_strong_no()
{
sum=0;
while(no>0)
{
int no3=num%10;
sum=sum+factorial(no3);
num=num/10;
}
return sum;
}

int factorial(int no3)
{
int fact=1;
int number=1;
while(number<no3)
{
fact=fact*no3;
number=number+1;
}
return fact;
}

}


