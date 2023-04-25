class Learn_if
{
public static void main(String[] args)
{
Learn_if li= new Learn_if();
li.find_highest_scorer(90,95);
}

void find_highest_scorer(int vk,int msd)
{
//int vk= 90;
//int msd= 100;
if(vk>msd)
 {
 System.out.println("virat"); //if i want something to get printed like virat and msddhoni instead of the score just put the name in "" .
 }
else if(msd>vk)
 {
 System.out.println("Dhoni");
 }
else
 {
System.out.println("virat and dhoni");
 //System.out.println(vk+msd);
 System.out.println(vk);
 System.out.println(msd);
 }
}

}
