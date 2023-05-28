class Cube_no {
public static void main (String[] args)
{
  Cube_no cb = new Cube_no();
  int no=1;
  while(no<=4)
  {
     int power=cb.find_cube(no,3);
     System.out.println(power);
     no=no+1;
     }
  }
 int find_cube(int base,int power)
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

// 1
// 8
// 27
// 64

 
