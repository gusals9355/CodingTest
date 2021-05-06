package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12916
public class PAndYInString {

	public static void main(String[] args) {
		String s = "ppyyPPYY";
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
		s.toLowerCase().split("");
        int pCnt=0;
        int yCnt=0;
        
        String[] c = s.toLowerCase().split("");
        
        for(int i=0; i<c.length; i++) {
        	if(c[i].equals("p")) pCnt++;
        	else if(c[i].equals("y")) yCnt++;
        }
        
        if(pCnt == yCnt) return true;
        return false;
    }

}
