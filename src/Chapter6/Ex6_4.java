package Chapter6;

public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.add(3, 5));
		System.out.println(mm.minus(3, 5));
		System.out.println(mm.mutilply(3, 5));
		System.out.println(mm.divide(3, 5));
		
		
	}

}

class MyMath{
	long add(long a, long b) {
		long result = a +b;
		return result;}
	long minus(long a,long b) {	return a-b;	}
	long mutilply(long a ,long b) {return a*b;}
	long divide(long a, long b) {return a/b;}
	
	
	
	
}
