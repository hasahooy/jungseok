package Chapter11;
import java.util.*;
public class Ex11_5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		// iterator는 1회용이라 다쓰고 나면 다시 얻어와야 한다. 
		it =list.iterator();
		
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
/*		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}*/
	}

}
