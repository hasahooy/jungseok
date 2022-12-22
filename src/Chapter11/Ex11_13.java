package Chapter11;
import java.util.*;
public class Ex11_13 {

	public static void main(String[] args) {
		Set set =new TreeSet(new TestComp()); //범위 검색 , 정렬 ,정렬 필요없음 
		
		for(int i=0; set.size()<6; i++) {
			int num=(int)(Math.random()*45+1);
			set.add(new Test()); // set.add(new Integer(num);
			// set .add 는 비교 하면서 정렬함
		}
		System.out.println(set);
	}
}
class Test{} 	//비교 기준이 ㅇ벗음 

class TestComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
}