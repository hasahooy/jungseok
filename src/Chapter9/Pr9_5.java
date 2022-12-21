package Chapter9;

public class Pr9_5 {
	public static String delChar(String src , String delCh) {//src 문자열 , delch 제거할 문자열 
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i=0; i<src.length(); i++) {
			char ch =src.charAt(i);
			
			if(delCh.indexOf(ch)==-1)  //indexOf(int ch)를 호출
				sb.append(ch);
		}
			return sb.toString(); //StringBuffer에 저장된 내용을 String 으로 반환 
		}
			
		
		
		
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+"->"
							+ delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + 
							delChar("(1 2 3 4 \t5)", "\t5"));
		
				
	}

}
