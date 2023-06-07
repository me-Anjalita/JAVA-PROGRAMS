package Startarray;

public class Stringdemo7_con3 {
//this prgm is to remove the front space we r giving before we type.For Eg: In google we used to give some space unknowingly before typing.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "   anjali ta";
		String name2 = "";
		char[] ch = name.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			char letter = ch[i];
			if (letter==' ')
			{
				
			}
			else {
			//System.out.print(ch[i]);
			name2 = name2 + letter; 
			}
		}
		System.out.println(name2);

	}

}
//output:Removing the space before letter comes.
//anjali
