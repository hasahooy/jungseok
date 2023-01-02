package Chapter6;

public class Ex6_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel 값은 "+ t1.channel +"입니다.");
		System.out.println("t2의 channel 값은 "+ t2.channel +"입니다.");
		
		t1.channel = 7; //channel 값을 7로 한다. 
		System.out.println("t1의 channel 값은 7로 변경한다");
		
		System.out.println("t1은 channel은"+ t1.channel + "입니다");
		System.out.println("t2은 channel은" + t2.channel+"입니다");
		t2.channel = 60 ;
		System.out.println("t2은 channel은" + t2.channel+"입니다");
	}

}
