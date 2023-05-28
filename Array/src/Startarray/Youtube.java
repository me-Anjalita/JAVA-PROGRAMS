package Startarray;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Youtube yt=new Youtube();
		yt.find_utube_time();
		}

	private void find_utube_time() {
		// TODO Auto-generated method stub
		int timings[]= {3,6,4,2,8};
		int sum=0;
		int avg=0;
		int i=0;
		while(i<timings.length) 
		{
			sum=sum+timings[i];
			avg=sum/timings.length;
			i++;
		}
		System.out.println("The average youtube watching time is "+ avg);
		
	}

}
