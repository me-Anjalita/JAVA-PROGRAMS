package com.learning;

class India
	{
	static String pm = "Modiji";
	static String capital = "New Delhi"; 
	static int inr_value = 81; 
	String state; 
	String mother_tongue;
	public static void main(String[] args)
	{
	India.inr_value = 80; 
	//India.pm = "rahul"; 

	India indian1 = new India(); 
	India.conduct_election();  //class-static
	indian1.cast_your_vote("DMK");
	indian1.state = "Tamil Nadu"; 
	India indian2 = new India();
	indian2.cast_your_vote("ADMK");
	indian2.state = "kerala"; 
	System.out.println(indian2.state); 
	System.out.println(indian1.pm); 
	System.out.println(indian2.pm);
	System.out.println(India.pm); 
	System.out.println(indian1.pm); 
	System.out.println(indian1.state); 
	System.out.println(indian2.state);
	India.conduct_election();
	indian1.cast_your_vote("bjp");

	}
	static void conduct_election()
	{

	}
	void cast_your_vote(String party)
	{
	System.out.println(party);
	}
	 

	

}
