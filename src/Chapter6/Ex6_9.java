package Chapter6;
class MyMath2{
	long a,b;

    // �ν��Ͻ� ���� a,b ���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����. 
 	long add()  { return a+b; } 
 	long minus() {return a-b;} 
 	long mutilply () {return a*b; }
 	long divide() {return a/b;}
 	// �ν��Ͻ� ������ ���� ���� �Ű����������� �۾��� �����ϴ�. 
 	static long add(long a,long b) { return a+b; }  
 	static long minus(long a, long b) {return a-b;} 
 	static 	long mutilply (long a ,long b) {return a*b; }
 	static long divide(long a, long b) {return a/b;}
}
 	
public class Ex6_9 {

	public static void main(String[] args) {
		//Ŭ���� �޼��� ȣ��, �ν��Ͻ� �������� ȣ�Ⱑ�� 
		System.out.println(MyMath2.add(200, 330));
		System.out.println(MyMath2.minus(200, 330));
		System.out.println(MyMath2.mutilply(200, 330));
		System.out.println(MyMath2.divide(200, 330));
	  // �ν��Ͻ� �޼���� ��ü ���� �Ŀ��� ȣ���̰��� 
		MyMath2 mm = new MyMath2();
		System.out.println(mm.add(500,400));
		mm.a =900L;
		mm.b = 400L;
		System.out.println(mm.minus(400,300));
		System.out.println(mm.mutilply());
		System.out.println(mm.divide());
	}

}
