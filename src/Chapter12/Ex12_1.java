package Chapter12;
import java.util.*;


class Product{}
class Tv1 extends Product{}
class Audio extends Product{}

public class Ex12_1 {	
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv1> tvList = new ArrayList<Tv1>(); 
//   	ArrayList<Product> tvList = new ArrayList<Tv>(); //  참조 에러 
// 		List<TV> tvList = new ArrayList<Tv>(); // ok. 다형성 
		
		productList.add(new Tv1());
		productList.add(new Audio());
		
		tvList.add(new Tv1());
		tvList.add(new Tv1());
		
		printAll(productList);
		//printAll(tvList) ; // 컴파일 에러가 발생한다. 
	}
	public static void printAll(ArrayList<Product> list) {
		for(Product p : list)
			System.out.println(p);
	}

}
