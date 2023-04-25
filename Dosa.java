class Dosa
{
public static void main(String[] args)
{
Dosa ds=new Dosa();
ds.find_no_of_dosas(8);
}
void find_no_of_dosas(int hotbox)
{
int count=3;
while(count>0)
{
hotbox=hotbox + hotbox/2;
count=count-1;


}
System.out.println("The Total no of dosas is" + hotbox);

}

}
