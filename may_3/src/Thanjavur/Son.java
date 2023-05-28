package Thanjavur;

public class Son extends Father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
		son.Share_assets();
		son.yield();
//		int father_amount=son.getamount();
//		System.out.println(father_amount);
		}
	void yield() //father class method
	{   //this step is called method overriding as though we dont want the content from fathers class so we will be using the new content from son's class.
		System.out.println("Son yielding");
	}

}
