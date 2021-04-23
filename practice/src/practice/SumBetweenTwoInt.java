package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12912
public class SumBetweenTwoInt {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(solution(a, b));
	}
	
    public static long solution(int a, int b) {
        long answer = 0;
        int max = a;
        int min = b;
        
//        if(a<b) {
//            max = b;
//            min = a;
//        }
//        
//        for(int i=a; i<=b; i++){
//            answer+=i;
//        }
        for(int i=Math.min(a, b); i<=Math.max(a, b); i++)
        	answer += i;
        
        return answer;
    }

}
