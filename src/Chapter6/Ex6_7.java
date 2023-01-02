package Chapter6;
class Date2{
	int x ;
}
public class Ex6_7 {

	public static void main(String[] args) {
		Date2 d = new Date2(); 
		d.x = 100;
		System.out.println("d.x :" + d.x);
		change(d);
		System.out.println("After change(d)");
		System.out.println("d.x :" + d.x);
		
	}
	static void change(Date2 d) {
		d.x = 400;
		System.out.println("X : " + d.x );
	}
}
