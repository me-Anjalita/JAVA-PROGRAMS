class EBcalculator
{
public static void main (String[] args)
{
EBcalculator reader = new EBcalculator();
int bill=reader.calculate_units(); //int bill== line isto return the vale to this line
System.out.println("one"+bill);
int amount = 500;
//int balance=amount-bill;
//System.out.println(balance);
reader.pay(amount,bill);

}
void pay(int amount,int bill)
{
System.out.println("two"+(amount-bill_1));//arguments need not to be same 
}
int calculate_units() // here we r changing void to int becoz return type is in int. In this line int is the return datatype
{
int units=150;
int price=2; // incase float=2.2f;......... It means should add f at end of the number.
System.out.println("thrice"+ units*price);
return units*price;
}

}

