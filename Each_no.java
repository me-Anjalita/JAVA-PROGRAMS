class Each_no {
public static void main(String[] args)
{
 Each_no en = new Each_no();
 int no=1;
 while(no<=4)
 {
  int power=en.find_eachno(no,no);
  System.out.println(power);
  no=no+1;
 }
}
int find_eachno(int base,int power)
 {
   int box=1;
   while(power>0)
   {
    box=box*base;
    power=power-1;
    }
          
 return box;
 }
    

}
//output
//1
//4
//27
//256
//


    

