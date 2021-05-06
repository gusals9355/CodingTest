package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12922
public class SuBak {

	public static void main(String[] args) {
		int n =4;
		System.out.println(solution(n));
	}
	
    public static String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++) {
        	if(i % 2 == 0) {
        		answer += "수";
        	}else {
        		answer += "박";
        	}
        }
        
        return answer;
    }

}
