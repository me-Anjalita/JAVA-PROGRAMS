package Startarray;

public class Reversename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversename rn=new Reversename();
		rn.reverse_name();

	}

	private void reverse_name() {
		// TODO Auto-generated method stub
		char[] name1= {'a','n','j','a','l','i'};
		char[] name2=new char[name1.length];
		int i=0;
		int j=name1.length-1;
		while(i<name1.length)
		{
			System.out.print(name2[i]=name1[j]);
			i++;
			j--;
		}
		
				
	}
}


