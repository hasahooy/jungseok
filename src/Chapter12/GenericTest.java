package Chapter12;
import java.util.ArrayList;

class Tv{}
class Aduio{}

public class GenericTest{
	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<Tv>();
		list.add(new Tv());
	//	list.add(new Audio());
		
	//	Tv t=(Tv)list.get(0); //list의 첫번째 요소를 꺼낸다. 
		Tv t =list.get(0);// list의 첫번째 요소를 꺼낸다. 
		
		
	}

}