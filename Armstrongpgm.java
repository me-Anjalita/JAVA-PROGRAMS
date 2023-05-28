class Armstrongpgm
{
public static void main(String[] args)
{
Armstrongpgm ap=new Armstrongpgm();
int num=1634;
int count=ap.count_ofdigit(1634);
System.out.println(count);
int result=ap.find_arms(num,count);
System.out.println(result);
ap.power(num,count);
if(num==result)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not Armstrong");
}
}
//TO COUNT HOW MANY DIGITS ARE THERE.....
int count_ofdigit(int num)
{

int count=0;
while(num>0)
{
int rem=num%10;
count=count+1;
num=num/10;
}
return count;
}

int power(int base,int power)//4,4 count=power
{
int box=1;
while(power>0)
{
box=box*base; //1*4,4*4,16*4,64*4
power=power-1; //totally 4 digits so each number will be multiplied for 4 times.
}
return box;//256//81
}


int find_arms(int num, int count)
{
int sum=0;
while(num>0)
{
int rem=num%10;//1634 4 is remaing 
sum=sum+power(rem,count);  //256+81+1296+1 = 1634
num=num/10;
}
return sum;
}

}
