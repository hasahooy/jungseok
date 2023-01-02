package Chapter7;
abstract class unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}
interface Fightable { 
	void move(int x,int y); // public abstract가 생략됨
	void attack(Fightable f); // 
}
class Fighter extends unit2 implements Fightable{
	//오버라이딩 규칙 : 조상(public )보다 접근제어자가 범위가 좁으면 안된다.
	public void move(int x,int y) {
		System.out.println("["+x+"],["+y+"])"+"로이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를공격");
	}
	public String toString() {
		return "안녕";
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
