package Chapter6;
class Date{
	int x ; 
}

public class Ex6_6 {

	public static void main(String[] args) {
		Date d = new Date();
		 d.x = 10 ; 
		System.out.println("main() x: "+ d.x);
		
		change(d.x);
		System.out.println("after change(d.x)");
		System.out.println("main() x: "+ d.x);
	}
	static void change(int x) {
	x= 1000;
	System.out.println("xÀÇ °ªÀº :" + x);
	}
}
