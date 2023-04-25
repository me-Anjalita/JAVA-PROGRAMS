class Looping_Practice2
{
public static void main(String[] args)
{
Looping_Practice2 lp = new Looping_Practice2();
//lp.find_power(3,5); 
int power=lp.find_power(3,5); // a variable should be assigned for the value to be assigned on the variable.
System.out.println(power);

}
//void find_power(int base, int power)
int find_power(int base, int power)
{
int box = 1; 
while(power>0)
{
box = box * base;
power = power - 1; 
}
//System.out.println(box); 
return box; // even after i have one way to do this why should i use this return way of doing
}

}

