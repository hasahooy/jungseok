package Chapter7;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car =null; 
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.drive();
		fe.water();
		car = fe;    // car = (car)fe ����;  ����Ÿ������ ����ȯ 
		//car.water();  ������ ���� 
		fe2 = (FireEngine)car ; // ���� -> �ڼ� ����ȯ ���� �Ұ� 
		fe2.water();
		
		
	}
}
class Car{
	String color; 
	int door;
	
	void drive() { // �����ϴ� ��� 
		System.out.println("drive.Brrrrrr~");
	}
	void stop() { // ���ߴ� ��� 
		System.out.println("stop!!!!!");
	}
}
class FireEngine extends Car{
	void water() { // ���� �Ѹ��� ��� 
		System.out.println("water~~~~");
	}
}