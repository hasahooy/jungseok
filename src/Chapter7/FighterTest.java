package Chapter7;
abstract class unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("����ϴ�");}
}
interface Fightable { 
	void move(int x,int y); // public abstract�� ������
	void attack(Fightable f); // 
}
class Fighter extends unit2 implements Fightable{
	//�������̵� ��Ģ : ����(public )���� ���������ڰ� ������ ������ �ȵȴ�.
	public void move(int x,int y) {
		System.out.println("["+x+"],["+y+"])"+"���̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"������");
	}
	public String toString() {
		return "�ȳ�";
	}
}

public class FighterTest {

	public static void main(String[] args) { 	 
		
		Fighter f= new Fighter();
		f.move(100,500);
		f.attack(new Fighter());
		unit2 f2 =new Fighter();
		f2.stop();
		
	}

}
