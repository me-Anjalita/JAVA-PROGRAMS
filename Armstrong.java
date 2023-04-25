class Armstrong  // armstrong means same number should come as output 
{
public static void main(String[] args)
{
Armstrong am=new Armstrong();
am.find_arm_no(153);
}
void find_arm_no(int no)
{
int no2=no;
int arm=0;
while(no>0)
{
 int rem=no%10;
 arm=arm+(rem*rem*rem);
 no=no/10;
}
if(no2==arm)
 {
 System.out.println("The armstrong num is"+ arm);
 }
else
 {
  System.out.println("Not a armstrong number");

 }


}

}
//The armstrong num is153


