package Startarray;

public class Stringdemo8_cont3 {//front space alone will be removed and middle space will be printed as such

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "   anjali t a";
	    String name2 = "";
	    boolean alphabet_came = false;
	    char[] ch = name.toCharArray();
	    for(int i=0; i<ch.length;i++)
	    {
	      char letter = ch[i];
	      if (letter==' ' && alphabet_came == false)//it means till now alphabet has not come
	      {
	  
	      }
	      else {
	        alphabet_came = true; //it means alphabet is there 
	      //System.out.print(ch[i]);
	      name2 = name2 + letter; //anjali 
	      }
	    }
	    System.out.println(name2);

	}

}
//output:Just front space alone getting deleted the middle space between letters will be considered.
//anjali t a
