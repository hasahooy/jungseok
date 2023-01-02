package Chapter7;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car =null; 
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.drive();
		fe.water();
		car = fe;    // car = (car)fe 생략;  조상타입으로 형변환 
		//car.water();  컴파일 에러 
		fe2 = (FireEngine)car ; // 조상 -> 자손 형변환 생략 불가 
		fe2.water();
		
		
	}
}
class Car{
	String color; 
	int door;
	
	void drive() { // 운전하는 기능 
		System.out.println("drive.Brrrrrr~");
	}
	void stop() { // 멈추는 기능 
		System.out.println("stop!!!!!");
	}
}
class FireEngine extends Car{
	void water() { // 물을 뿌리는 기능 
		System.out.println("water~~~~");
	}
}