class Multi_3_5
{
public static void main(String[] args)
{
Multi_3_5 M35=new Multi_3_5();
M35.find_multi();
}
void find_multi()
{
int no = 1;
while(no<=50)
{
 if(no%3==0 && no%5==0)    // In this line if the question was 3 OR 5 the should change && to || nothing else will be changed .
   {
     System.out.println(no+ "is multiple of 3 and 5");
   }
no=no+1; 


}


}
}
//output
//15is multiple of 3 and 5
//30is multiple of 3 and 5
//45is multiple of 3 and 5

