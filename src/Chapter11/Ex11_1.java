package Chapter11;
import java.util.*;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 =new ArrayList(10);
		//ArrayList에는 객체만 저장가능 
		//autoboxing에 의해 기본형이 참조형으로 자동 변환 
		//list1.add(new Integer(5));
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//ArrayList(Collecion c) 를 이용한거 
		//List sub = list1.sublist(1,4);  sub는 읽기만 가능 [4,2,0]
		//ArrayList list2 =new ArrayList(sub); sub와 같은 내용 ArrayList 생성
		//밑에 꺼 풀어 쓰면 
		ArrayList list2 =new ArrayList(list1.subList(1, 4));
		print(list1, list2);

		//Colletion은 인터페이스 , Collections 는 유틸클래스 
		Collections.sort(list1); //list1과 list2를 정렬한다. 
		Collections.sort(list2); //Collections.sort(List 1)
		print(list1, list2);
		
		//containsAll list1에서 list2 요소를 포함하고 있는지 확인
		System.out.println("list1.containsAll(list2):"
				+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("c");
		list2.add(3,"A");
		print(list1, list2 );
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0,"1");
		//indexOf()는 지정된 객체의 위치(인덱스)를 알려준다. 
		System.out.println("index="+list1.indexOf(new Integer(1)));
		list1.remove(1);
		//list1.remove(new Integer(1));
		print(list1,list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retaimAll(list2):"+ list1.retainAll(list2));
		
		print(list1, list2);
		
		//list2에서 list1 에 포함된 객체들을 삭제한다. 
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}
//main 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
	}
