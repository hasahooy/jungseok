package Chapter6;

public class Ex6_1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 7 ;
		t.channelDown();
		t.channelDown();
		System.out.println("현재 Tv채녈은 "+ t.channel+"입니다.");	
		}
	

}

class Tv { 
	//Tv의 속성 ( 멤버 변수 ) 
	String color ;  // 색상
	boolean power; // 전원
	int channel; // 채널 
	
	//Tv의 기능(메서드 ) 
	void power() {power = !power;}
	void channelUp() { ++ channel;}
	void channelDown() { -- channel;} 
}