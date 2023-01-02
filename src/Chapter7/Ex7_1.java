package Chapter7;

class Tv{
	boolean power;  //전원 상태 
	int channel; // 채널
	
	void power() {
		power = ! power; 
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel; 
	}
}

class SmartTv extends Tv{ //SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가 
	boolean caption; //캡션 상태 (on/off) 
	void displayCaption(String text) {
		if(caption) { // 캡션 상태가 on(true)일 때만 text를 보여준다 . 
			System.out.println(text);
		}
	}
}


public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel =10;    //조상 클래스로부터 상속받은 멤버
		stv.channelDown();   // 조상 클래스로부터 상속 받은 멤버 
		System.out.println(stv.channel);
		stv.displayCaption("Hello,world");
		stv.caption = true;   // 자막을 킨다. 
		stv.displayCaption("Hello ,world");
		
	}

}
