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
		
		System.out.println("c1.kind에 무늬는"+c1.kind+"이고 c1.number는 "+c1.number);

		System.out.println("c2.kind에 무늬는"+c2.kind+"이고 c2.number는"+c2.number);
		
		c1.width = 50;
		c1.height = 70 ; 
		
			
		System.out.println("c1 Card.width는 "+c1.width);
	// c1이 바꼈지만 c1 과 c2는 클래스 변수라 서로 공유하기 때문에 바뀐 값이 나온다. 
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