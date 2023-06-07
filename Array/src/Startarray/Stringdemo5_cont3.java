package Startarray;

public class Stringdemo5_cont3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "anjaliTA 12345";
	    for(int i=0; i<name.length(); i++)
	    {
	    char letter = name.charAt(i); //letter = A
	//if the letter is present in between 'A' and 'Z':
	    if(letter>='A' && letter<='Z')
	      System.out.print((char)(letter+32));
	    else
	      System.out.print(letter);
	    }

	}

}
//OUTPUT
//anjalita 12345
