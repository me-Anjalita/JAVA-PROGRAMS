package Startarray;

public class Cricketers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketers ck=new Cricketers();
		ck.find_eldest();

	}

	private void find_eldest() {
		// TODO Auto-generated method stub
		int[] age = {45,30,35,29,40};
		String[] name= {"dhoni","hardhik pandiya","virat","sachin","bumrah"};
		int index_e=0;
		int eldest=age[0];
		int i=1;
		while(i<age.length)
		{
			if(age[i]>eldest)
			{
				eldest=age[i];
				index_e=i;
				
			}
		i++;
		
		} //always give print statment afer the loop. Only after looping ,the statement will be printed.
		System.out.println("Oldest age is "+ eldest + ",age of" + name[index_e]);
		
		
		
	
		
	}

}
