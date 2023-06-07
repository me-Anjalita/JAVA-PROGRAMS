package Startarray;

public class Stringdemo6_con3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "anjali ta";
		//AmAlRaJ
		//0123456
		//0	2 4 6 --> Index
		
		for(int i=0; i<name.length();i++)
		{
			char letter = name.charAt(i);
			if(letter>='a' && letter<='z')//It will go inside this if statement only if the letters are small letters.
			{
				if(i%2==0)
					{
					System.out.print((char)(letter-32));
					}
				else//if the index is odd number the letter will be printed as such ,it wont be changed
				{
					System.out.print(letter);
				}
			}
			  else //if space or the letter is big the same letter and space will be printed as such
		      {
		        System.out.print(letter);
		      }
		    }
	}

}


//output
//AnJaLi tA
