class Continous_no
{
public static void main(String[] args)
{
Continous_no cn=new Continous_no();
cn.find_numbers(1);
cn.increase_no(0);
cn.increment_no(1);
cn.multiplication_no(1);
}
void find_numbers(int count)
{
 while(count<=5)
 {
 System.out.println(1+" ");
 count=count+1;
 }
}
//output 
//1 
//1 
//1 
//1 
//1 

void increase_no(int count)
{
 while(count<5)
 {
 System.out.println(count+1);
 count=count+1;
 }

}
//output
//1
//2
//3
//4
//5
void increment_no(int count)
{
while(count<=10)
 {
 System.out.println(count);
 count=count+2;
 }

}
//output
//1
//3
//5
//7
//9

void multiplication_no(int no1)
{
while(no1<=5)
 { System.out.println(no1 * 3);
   no1=no1+1;
   
 }

}
//output
//3
//6
//9
//12
//15

}





