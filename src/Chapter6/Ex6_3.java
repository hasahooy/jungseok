package Chapter6;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " +Card.width);
		System.out.println("Card.height = " + Card.height);
	
		Card c1 =new Card();
		Card c2 =new Card();
		
		c1.kind = "Heart";
		c2.kind = "spade";
		c1.number = 6 ; 
		c2.number = 7 ; 
		
		System.out.println("c1.kind�� ���̴�"+c1.kind+"�̰� c1.number�� "+c1.number);

		System.out.println("c2.kind�� ���̴�"+c2.kind+"�̰� c2.number��"+c2.number);
		
		c1.width = 50;
		c1.height = 70 ; 
		
			
		System.out.println("c1 Card.width�� "+c1.width);
	// c1�� �ٲ����� c1 �� c2�� Ŭ���� ������ ���� �����ϱ� ������ �ٲ� ���� ���´�. 
		System.out.println("c2 Card.width " +c2.width 
				+" c2 Card.height" +c2.height);
	}

}

class Card{
	String  kind;
	int number;
	static int width =100;
	static int height = 250;
}