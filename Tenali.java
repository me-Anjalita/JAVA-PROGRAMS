class Tenali
{
public static void main(String[] args)
{
Tenali story = new Tenali(); 
//story.find_security(1024); 
//story.find_flowers(7);
story.print_1();
}
void print_1()
{
int count = 1; 
while(count<=5)
    {
   // System.out.print(1+" ");
    count = count+1;
    System.out.println(count);
    }
}
void find_flowers(int temples)
{
//1. Initially flowers count is 1. 
//2. Until temples count becomes 0: 
//    1. flowers count is flowers count*2. 
//    2. Decrement temples count by 1. 
int flowers_count = 1;
while(temples>0)
    {
    flowers_count = flowers_count * 2; 
    System.out.println("Flowers count each time "+ flowers_count);
    temples = temples - 1; 
    System.out.println("Temple count each time "+ temples);
    }
System.out.println("Flowers count is "+ flowers_count);
}

void find_security(int beats)
{
int security = 0; 
while(beats>1)
{
System.out.println("Each security gets "+ (beats/2));
beats = beats/2; 
security = security +1;
}
System.out.println("Total no. of securities "+security);
}

}
