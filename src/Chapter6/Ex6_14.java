package Chapter6;

public class Ex6_14 {

	static {
		System.out.println("static {}");  // static Ŭ���� �ʱ�ȭ ����
	}
	
	{
		System.out.println(" {} ") ; //�ν��Ͻ� �ʱ�ȭ ����
	}
	
	Ex6_14(){
		System.out.println("������");
	}
	public static void main(String[] args) {
		System.out.println("Ex6_14 bt =new Ex6_14();");
		Ex6_14 bt = new Ex6_14();
	
		System.out.println("Ex6_14 bt2 =new Ex6_14();");
		Ex6_14 bt2 = new Ex6_14();
	
	
	}

}