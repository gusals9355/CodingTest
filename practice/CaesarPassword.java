package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12926
public class CaesarPassword {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		solution(s, n);
	}
	
    public static String solution(String s, int n) {
        String answer= "";
        char[] c = new char[s.length()];
        
    	for(int i=0; i<c.length; i++) {
    		c[i] = s.charAt(i);
    		
    		if(c[i] == ' ') { //공백일때
    			answer += c[i];
    		}else { // 공백아닐때
    			if(c[i] >= 65 && c[i] <=90) {//대문자일때
    				if(c[i]+n > 90) { //아스키 코드값 Z를 넘어설때
    					answer += (char)((c[i]+n)-26);
    				}else {
    					answer += (char)(c[i]+n);
    				}
    			} else { //소문자 일때
    				if(c[i]+n > 122) { //아스키 코드값 z를 넘어설때
    					answer += (char)((c[i]+n)-26);
    				} else {
    					answer += (char)(c[i]+n);
    				}
    			}
    		}
    	}
        
        System.out.print(answer);
        
        
        return answer;
    }
	
}
