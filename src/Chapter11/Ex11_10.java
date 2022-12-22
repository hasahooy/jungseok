package Chapter11;
//로또 문제 
import java.util.*;
public class Ex11_10 {
	public static void main(String[] args) {
		Set set =new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45+1);
			set.add(num);
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);   //Collection 은 인터페이스  , Collections 클래스 
		System.out.println(list);
		
	}
}
