package Chapter7;
class Product2{
	int price;
	int bonusPoint ;
	
	Product2(int price){
		this.price = price ;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2(){}
}
class Tv2 extends Product2{
	Tv2(){super(500);}
	public String toString() {return "k";}
}
class Computer2 extends Product2{
	Computer2(){super(200);}
	public String toString() {return "j";}
}
class Audio2 extends Product2{
	Audio2(){	super(80);}
	public String toString() {return "m";}
}
class Buyer2{
	int money = 4000;  
	int bonusPoint =9000;
	Product2[] cart = new Product2[19];  
	int i = 0 ;
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; 
		System.out.println(p + "을/를 구입하셨습니다.");	
	}	
	void summary() {
		int sum = 0; 
		String itemList = "";
		//반복문을 이용해서 구입한 물품의 총가격과 목록을 만든다. 
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) break ;
			sum += cart[i].price ; 
			itemList += cart[i] + " ,";
		}
		System.out.println("구입하신 물품의 총금액은" + sum  +"만원입니다.");
		System.out.println("구입하신 제품은" + itemList + "입니다.");
	}
}

public class Ex7_9 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary(); 
	}

}
