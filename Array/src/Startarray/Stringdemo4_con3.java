package Startarray;

public class Stringdemo4_con3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Anjali";
		for(int i=0; i<name.length(); i++)
		{
		char letter = name.charAt(i); //letter = A
//if the letter is present in between 'a' and 'z':
		if(letter>='a' && letter<='z')
			System.out.print((char)(letter-32));
		else
			System.out.print(letter);
		}

	}

}
//output
//ANJALI
