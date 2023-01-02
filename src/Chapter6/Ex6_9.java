package Chapter6;
class MyMath2{
	long a,b;

    // 인스턴스 변수 a,b 만을 이용해서 작업하므로 매개변수가 필요없다. 
 	long add()  { return a+b; } 
 	long minus() {return a-b;} 
 	long mutilply () {return a*b; }
 	long divide() {return a/b;}
 	// 인스턴스 변수와 관계 없이 매개변수만으로 작업이 가능하다. 
 	static long add(long a,long b) { return a+b; }  
 	static long minus(long a, long b) {return a-b;} 
 	static 	long mutilply (long a ,long b) {return a*b; }
 	static long divide(long a, long b) {return a/b;}
}
 	
public class Ex6_9 {

	public static void main(String[] args) {
		//클래스 메서드 호출, 인스턴스 생성없이 호출가능 
		System.out.println(MyMath2.add(200, 330));
		System.out.println(MyMath2.minus(200, 330));
		System.out.println(MyMath2.mutilply(200, 330));
		System.out.println(MyMath2.divide(200, 330));
	  // 인스턴스 메서드는 객체 생성 후에만 호출이가능 
		MyMath2 mm = new MyMath2();
		System.out.println(mm.add(500,400));
		mm.a =900L;
		mm.b = 400L;
		System.out.println(mm.minus(400,300));
		System.out.println(mm.mutilply());
		System.out.println(mm.divide());
	}

}
