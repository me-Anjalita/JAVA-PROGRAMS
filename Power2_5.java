class Power2_5
{
public static void main(String[] args)
{
Power2_5 pow=new Power2_5();
pow.findpow(2,5);
}
void findpow(int base,int power)
{
int box=1;
while(power>0)  //5>0, 4>0, 3>0, 2>0, 1>0 , 0>0
{
 box=box*base;  //box=1*2 = 2, 2*2=4, 4*2=8,8*2=16, 16*2=32.
 power=power-1; //4(5-1),3(4-1),2(3-1),1(2-1).
System.out.println("2 power 5 is " + box);

}

}
