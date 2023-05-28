class Print_num 
{
 public static void main (String[] args)
    {
        Print_num pn=new Print_num();
        pn.find_print_num(1,10);
    }
void find_print_num(int no1,int no2)
{

 while(no1<=5)
  {
    System.out.println(no1*no2);
    no1=no1+1;
    no2=no2-1;
   }

}

}

//output 
//10
//18
//24
//28
//30

