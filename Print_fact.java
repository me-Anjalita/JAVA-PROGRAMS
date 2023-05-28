class Print_fact
{
public static void main(String[]  args)
{
Print_fact pf=new Print_fact();
int no=1;
while(no<=5)
{
pf.find_facto(no);
no++;
}

}
void find_facto(int no)
{ 
int fact=1;
// int no=5;
while(no>=1)
{
fact=fact*no;
no=no-1;
}
System.out.println(fact);
}

}
//output
//1
//2
//6
//24
//120

