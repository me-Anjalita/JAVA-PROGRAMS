package Learning;

public class Loopingdemo {
	
	public static void main (String[] args)
	{
	Loopingdemo ld=new Loopingdemo();
	ld.swap(10,100);
	}
private void swap(int no1, int no2) 
{
    // TODO Auto-generated method stub
    System.out.println("Before Swapping"); 
    System.out.println(no1+" and "+no2);
    no1 = no1 + no2; //no1 = 110; 10+100
    no2 = no1 - no2; //no2 = 10; 110-100
    no1 = no1 - no2; //no1 = 100; 110-10 
    System.out.println("After Swapping"); 
    System.out.println(no1+" and "+no2);
    
 }
}
