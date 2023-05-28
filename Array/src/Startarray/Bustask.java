package Startarray;

public class Bustask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int cost[] = {30,30};
	      int i = 0;
	      int total = 0;
	      int days =25;
	      while(i<cost.length) 
	      {
	        total = total +cost[i];
	        i++;
	      }
	      int total_amt = days*total;
	      int new_amt = total_amt/2;
	      int profit =  total_amt - new_amt;
	      double percentage = ((double)profit/total_amt)*100;
	      System.out.println("total profit percentage :" + percentage+"%");
	      
	  }

}


