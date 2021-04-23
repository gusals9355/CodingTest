package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12903
public class GetTheMiddleCharacter {

	public static void main(String[] args) {
		String s = "ab";
		System.out.println(solution(s));
	}
	
    public static String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 != 0) { // 길이가 짝수라면
        	answer = s.substring(s.length()/2, s.length()/2+1);
        }else {
        	answer = s.substring(s.length()/2-1, s.length()/2) + s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }

}
