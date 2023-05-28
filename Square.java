class Square 
{
 public static void main(String[] args)
 {
   Square cb = new Square();
   int no=1;
   while(no<=10)
   {
    int power=cb.find_square(no,2);
    System.out.println(power);
    no=no+1;
    }
  }
 int find_square(int base,int power)
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
//9
//16
//25
//36
//49
//64
// 81
// 100
