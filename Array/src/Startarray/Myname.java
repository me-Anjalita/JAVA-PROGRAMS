package Startarray;

public class Myname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myname nm=new Myname();
		nm.find_midletter();
		}

	private void find_midletter() {
		// TODO Auto-generated method stub
		char[] name= {'a','n','j','a','l','i'};
		int i=0;
		int mid=0;
		while(i<name.length)
		{
			
			//System.out.println(name.length);
			mid=name.length/2;
			i++;
		}
		System.out.println("The middle charachter of name anjali is"+ name[mid]);
		if(name.length%2==0)
			{
			System.out.println("The middle charachter of name anjali is" + name[mid-1]);
			}
		
		
		
		
	}

}
