package Chapter10;
import java.util.*;
public class Ex10_5 {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage: java Ex10_5 2022 12");
			return; 
		}
		int year =2022;
		int month= 12;
		int START_DAY_OF_WEEK =0;
		int END_DAY=0;
		
		Calendar sDay =Calendar.getInstance(); //시작임
		Calendar eDay= Calendar.getInstance(); //끝임
		
		//월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다 .
		//예를 들어 ,2022년 12월 1일은 sDay.set(2022,13,1)괴 같이 해줘야한다.
		
		sDay.set(year,11,1);
		eDay.set(year,12,1);
		// 다음달의 첫날(12월 1일 )에서 하루를 빼면 현재달의 마지막날 (11월 30일 이된다)
		eDay.add(Calendar.DATE,-1);
		
		//첫번째 요일이 무슨 요일인지 알아낸다. 
		START_DAY_OF_WEEK =sDay.get(Calendar.DAY_OF_WEEK);
		
		//eDay에 지정된 날짜를 얻어온다.
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("  "+year+"년 "+month+"월");
		System.out.println(" su mo tu we th fr sa ");
		
		// 해당 월의 1일이 어느 요일인지에 따라서 공백을 출련하다. 
		// 만일 1일이 수요잉ㄹ이라면 공백을 세번 찍는다 . (일요일부터 시작)
		for(int i=1; i<START_DAY_OF_WEEK; i++) {
			System.out.print("  ");
		}
		for(int i=1,n=START_DAY_OF_WEEK;i<=END_DAY;i++,n++) {
			System.out.println((i<10)?"  "+i:" "+i);
			if(n%7==0) System.out.println();
		}
		}
		
		
		
	}


