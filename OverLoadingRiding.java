//program with  overloading and over riding
public class OverLoadingRiding
{
public static void main(String args[])
{
Riding l1= new Riding();
l1.add(8,5);
l1.add(7,4,9);
//Riding.sub(9,2);//static method call by class name
l1.sub(9,2);//static method call by object
}
}
//over loading execute in these class 2methods with same name but variations in number of parameters 
class Loading
{
    int add(int a,int b)  // method is same but the arguments will be different for each method.
    {
    int c=a+b;
    System.out.println("adding a+b is "+c);
    return c;
    }
int add(int a,int b,int c)
    {
    int d=a+b+c;
    System.out.println("adding a+b+c is "+d);
    return d;
    }
int sub(int a,int b)
    {
    int c=a-b;
    System.out.println("subracting a-b is "+c);
    return c;
    }
}
//overriding execute in these class. Across 2class 2methods with same name & same number of parameters  
class Riding extends Loading   //loading = parent class , Riding=child class
{
 int sub(int a,int b)    // Method overriding is all about overtaking the content of main class and using the new content of the child class. 
    {
    int c=a*b;
    System.out.println("multiplying (a*b) is "+c);
    return c;
    }
}
