package Startarray;

public class Stringdemo9_con3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="  anjali  ";
		System.out.println(name.stripLeading()); //remove the spaces given in the front
		System.out.println(name.stripTrailing()); //remove the spaces at the end
		System.out.println(name.trim()); //removes both leading and trailing whitespaces.
		System.out.println(name.indexOf('a'));//it will print 2 becoz the index number of space will also be considered
		System.out.println(name.lastIndexOf('a'));//it will print 5 becoz the index number of space will also be considered
		name=name.concat(" t a");//will join "t a" with anjali  
		System.out.println(name);//the concatenated name will be printed
        
	}

}

//output
//anjali  
//  anjali
//anjali
//2
//5
//  anjali   t a

