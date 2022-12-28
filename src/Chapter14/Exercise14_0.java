package Chapter14;

import java.util.function.Function;


public class Exercise14_0 {

	public static void main(String[] args) {
	//	Function<String , Integer> f= (String s) - > Integer.parseInt(s);
		//Function<String , Integer> f= 쿨래스이름 ::메서드이름 ; 
	//	Function<String , Integer> f= Integer::parseInt; //메서드 참조 
		//System.out.println(f.apply("100")+200); 
     // 메서드 참조  part 	
	
		
		//Supplier는 입력 x ,출력 o 
		
		//Supplier<MyClass> s= ()-> new MyClass();
	//	Supplier<MyClass> s= 클래스이름 :: 메서드이름 ; 
//		Supplier<MyClass> s= MyClass::new ; 생성자 생겨,매개변수 입력이 하나 생김 Function으로 바꿔야함
		
		Function<Integer,MyClass> f= (i) -> new MyClass(i);
		//Function<Integer,MyClass> f= MyClass::new;
		
		MyClass mc = f.apply(100); 	
		System.out.println(mc.iv); 
	//	System.out.println(s.get());  Supplier 때 쓰인 거
		System.out.println(f.apply(200).iv);
		
		//배열 만들기 무조건 Function 으로 배열의 길이를 줘야 하기 떄문에 
		Function<Integer, int[]> f2 = (i) -> new int[i];
		// Function<Integer, int[]> f2 = int [] :: new; // 메서드 참조  
		System.out.println(f2.apply(100).length);		
		int[] arr = f2.apply(100);
	}
}
class MyClass{
	int iv;
	
	MyClass(int iv){
		this.iv = iv;
	}
}
