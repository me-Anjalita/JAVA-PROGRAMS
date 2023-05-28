class Square_root
{
public static void main(String[] args)
{
Square_root sq=new Square_root();
sq.find_sqr_root(81);
}

private void find_sqr_root(int no)
{
  int div = 2; 
  while(div<no)
  {
	if(no/div == div)
	 {
		System.out.println(div);
		break; 
	 }
   div++;
   }
		
}


}
//output 
//9

