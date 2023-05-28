class Swaping
{
public static void main(String[] args)
{
Swaping sw=new Swaping();
//sw.swap(10,100);
sw.swap_no3(10,100);
}
void swap(int no1,int no2)
{
System.out.println("Before Swapping"); 
    System.out.println(no1+" and "+no2);
    no1 = no1 + no2; //no1 = 110; 10+100
    no2 = no1 - no2; //no2 = 10; 110-100
    no1 = no1 - no2; //no1 = 100; 110-10 
    System.out.println("After Swapping"); 
    System.out.println(no1+" and "+no2);
    
 }
//output
//Before Swapping
//10 and 100
//After Swapping
//100 and 10

void swap_no3(int no1,int no2)
{
System.out.println("Before Swapping"); 
System.out.println(no1+" and "+no2);
  int no3=no1;
  no1=no2;
  no2=no3;
    
  System.out.println("After Swapping"); 
  System.out.println(no1+" and "+no2);
    
    

}


}
//OUTPUT
//Before Swapping
//10 and 100
//After Swapping
//100 and 10



