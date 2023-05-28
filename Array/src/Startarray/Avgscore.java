package Startarray;

public class Avgscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avgscore  as=new Avgscore();
		as.find_avgsc();
		}

	private void find_avgsc() {
		// TODO Auto-generated method stub
		int[] scores= {301,200,342,425,250,440};
		int sum=0;
		int avg=0;
		int i=0;
		
		while(i<scores.length)
			
		{
			sum=sum+scores[i];
			avg=sum/scores.length; // can also give avg=sum/6;
			i++;
			
		}
		System.out.println("The average of hardik pandiya's runs scored :" + avg);
		
		
	}

}
