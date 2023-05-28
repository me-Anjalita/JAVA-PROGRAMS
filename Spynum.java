class Spynum 
{
public static void main(String[] args)
{
Spynum sp=new Spynum();
sp.find_spyno(1412);
}
void find_spyno(int no)
{
 int sum=0;
 int multi=1;
 while(no>0)
 {
   int rem=no%10;
   sum=sum+rem;
   multi=multi*rem;
   no=no/10;
 }
  if(sum==multi)
   {
     System.out.println("Yes its a spynumber");
    }
  else
   {
     System.out.println("Its not a spynumber");
    }

}



}
//output
//Yes its a spynumber

    

