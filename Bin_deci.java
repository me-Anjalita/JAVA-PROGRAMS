class Bin_deci
{
public static void main (String[] args)
{
Bin_deci BD=new Bin_deci();
BD.binary_decimal(101);
}
void binary_decimal(int binary)
{
int no=101;
int po=0;
int decimal=0;
Looping_Practice2 lp = new Looping_Practice2();   //bringing another class's object to this class becoz another class has this method findpower,which can be used to findthe power in this program .
while(no>0)
{
int rem = no%10;
decimal=decimal+(rem*lp.find_power (2,po));
no=no/10;
po=po+1;
}
System.out.println("decimal value is"+decimal);
}

}
// decimal value is5

