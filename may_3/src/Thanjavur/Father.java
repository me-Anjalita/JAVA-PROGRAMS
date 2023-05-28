package Thanjavur;

public class Father {
	private int amount = 100000000;
	private int amount2=1234;
	
	public int getamount() //its just a convection. to get the value to return it.
	{
		return amount;  // alt+s to click the getter and setter so the steps will be printed on its own we noneed to type these sentence.
	}
	
	void yield()
	{
		System.out.println("yield paddy");
	}
	protected void Share_assets() //protected property it has access to both the kids.
	{
		System.out.println("sharing assets");
	}

}
