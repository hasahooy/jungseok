package Chapter7;

class Tv{
	boolean power;  //���� ���� 
	int channel; // ä��
	
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

class SmartTv extends Tv{ //SmartTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� �߰� 
	boolean caption; //ĸ�� ���� (on/off) 
	void displayCaption(String text) {
		if(caption) { // ĸ�� ���°� on(true)�� ���� text�� �����ش� . 
			System.out.println(text);
		}
	}
}


public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel =10;    //���� Ŭ�����κ��� ��ӹ��� ���
		stv.channelDown();   // ���� Ŭ�����κ��� ��� ���� ��� 
		System.out.println(stv.channel);
		stv.displayCaption("Hello,world");
		stv.caption = true;   // �ڸ��� Ų��. 
		stv.displayCaption("Hello ,world");
		
	}

}
