class Deci_bin
{
public static void main(String[] args)
{
Deci_bin DB=new Deci_bin();
DB.decimal_binary(5);
}
void decimal_binary(int decimal)
{
int no=5;
int po=0;
int binary=0;
Looping_Practice2 lp = new Looping_Practice2();   //bringing another class's object to this class becoz another class has this method findpower,which can be used to findthe power in this program .
while(no>0)
{
int rem = no%10;
binary=binary+(rem*lp.find_power);
no=no/10;
po=po+1;
}
System.out.println("binary value is"+binary);
}

}

