package bindec;

public class Bin_deci {
	
	public static void main (String[] args)
	{
	Bin_deci BD=new Bin_deci();
	//BD.binary_decimal(101);
	int no1 = 10; 
	int no2 = 20; 
	System.out.println(no1++ + no2++ + ++no1 + ++no2 + no1-- + no2-- + --no1 + --no2);		
					// 10   +    20 +    12 +    22 + 	12 + 	22 + 	10	 +	20
//	     no=1(while called again it is actually 11) no2=actually its 21 but will be shown as 20
		
	
	}
	void binary_decimal(int binary)
	{
	int no=101;
	int po=0;
	int decimal=0; 
	Looping_Practice2 lp = new Looping_Practice2();
	while(no>0)
	{
	int rem = no%10;
	decimal=decimal+(rem*lp.find_power (2,po));
	no=no/10;
	po=po+1;
	}
	System.out.println("decimal value is"+decimal);
	}

	


}
