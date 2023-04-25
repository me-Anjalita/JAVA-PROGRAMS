class Multiplication
{
public static void main(String[] args)
{
Multiplication ml = new Multiplication();
ml.find_multiples(2);
}
void find_multiples(int no1)
{
int no2 = 1; 
while(no2<=5)
{
System.out.println(no2 + " * 2 = "+ (no2 * no1));
no2 = no2 + 1; 
}

}

}
