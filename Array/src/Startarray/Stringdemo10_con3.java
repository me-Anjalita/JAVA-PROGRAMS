package Startarray;

public class Stringdemo10_con3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "nee kavithaigala.mp3";

		  System.out.println(name.substring(16)); // Till 15th index the letters wont be considered, will be considered only from 16th letter
		  System.out.println(name.substring(0, 16));//this means that from 0 to 15 index the letters will be considered,hence starting a nd ending index is given.

	}

}
//output: In this program overloading of method is happening
//.mp3 //This is from the 16th index
//nee kavithaigala // This is from the 0th index to 15th index
