package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12921
public class FindDecimal {

	public static void main(String[] args) {
		int n=10;
		solution(n);
	}
	
	public static int solution(int n) {
		int answer=0;
		
        for(int i=2; i<=n; i++){
            boolean verify = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0) {
                	verify = false;
                	break;
                }
            }
            if(verify) {
            	System.out.println(i);
            	answer++;
            	
            }
        }
		
		return answer;
	}

}
