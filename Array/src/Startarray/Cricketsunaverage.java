package Startarray;

public class Cricketsunaverage { //here for loop is useds

  public static void main(String[] args) {
  
    Cricketsunaverage   cricketaverage = new Cricketsunaverage();
      
    cricketaverage.findaverage();
}
private void findaverage()
{
  int[] cricketscores = { 345,234,150,435,456,333,431};
  int length =cricketscores.length;
  
int sum=0;
int average=0;
for (int i=0;i<length;i++)
 {

sum=sum+cricketscores[i];
average=sum/length;

}
System.out.println(average);
}
}