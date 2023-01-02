package Chapter7;
class Product{
	int price;  // ��ǰ�� ���� 
	int bonusPoint;  // ��ǰ ���Ž� �����ϴ� ���ʽ����� 
	
	Product(int price){
		this.price = price; 
		bonusPoint = (int)(price /10.0); //���ʽ������� ��ǰ������ 10% 
	}
}
class Tv1 extends Product{
	Tv1(){
		//����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(1010); // Tv�� ������ 100������ �Ѵ�. 
	}
	public String toString() { return "Tv";	}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}

class Buyer{ //�� ,������ ��� ���
	int money = 1000; // �����ݾ�
	int bonusPoint =30; //���ʽ� ���� 
	
	void buy(Product p) {
		if(money<p.price) {
		   System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
		   return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint ; //��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		System.out.println(p+"�� /�� �����ϼ̽��ϴ�.");
	}
}
public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b =new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("���� ���� ����" + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ�������"+b.bonusPoint + "���Դϴ�.");
	}

}
