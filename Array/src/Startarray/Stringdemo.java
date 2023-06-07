package Startarray;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String last_movie1 = "GN";
		  String last_movie2 = "GN";
		  String last_movie3 = "GN";
		  String last_movie4 = "GN";  //All these 4 will point the same memory
		  System.out.println(last_movie1.hashCode()); //Hashcode is memoryid given by java.
		  System.out.println(last_movie2.hashCode());
		  System.out.println(last_movie3.hashCode());
		  System.out.println(last_movie4.hashCode());
		  last_movie1 = "2018"; //The first person is watching a new movie called "2018"
		  System.out.println(last_movie1.hashCode()); //this lastmovie_1 memoryid alone will be changed 
		  System.out.println(last_movie2.hashCode());
		  System.out.println(last_movie3.hashCode());
		  System.out.println(last_movie4.hashCode());
		  String name = "sabaribala";
//		  System.out.println(name.charAt(0)); //ALL these will print the name sabari into seperate characters 
//		  System.out.println(name.charAt(1));
//		  System.out.println(name.charAt(2));
//		  System.out.println(name.charAt(3));
//		  System.out.println(name.charAt(4));
//		  System.out.println(name.charAt(5));
		  System.out.println(name.length());
		  for(int i=0;i<name.length();i++) //if u give i<=5 it will print sabari alone
		  {
			  if(name.charAt(i)=='a') //this will print the 'a' alone from sabari bala name. So totallyb4 a's
			  System.out.println(name.charAt(i));
		  }
		  System.out.println(name.charAt(0));
		  System.out.println(name.charAt(name.length()-1));
		  System.out.println(name.charAt(name.length()/2));

	}

}
//output
//2279
//2279
//2279
//2279
//1537253//this new memoryid alone different becoz the movie name has been updated for the 1st peron. 
//2279
//2279
//2279
//s
//a
//b
//a
//r
//i
//b
//a
//l
//a
