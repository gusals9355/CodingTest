package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12954
public class xIntervalNNumber {

	public static void main(String[] args) {
		
		long[] answer =solution(10000000, 1000);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        int cnt=0;
        int cnt2=1;
//        for(int i=x; i<=x*n; i+=x) {
//        	answer[cnt] = i ;
//        	cnt++;
//        }
        for(int i=0; i<answer.length; i++) {
        	answer[cnt++] = x*cnt2++;
        }
        return answer;
    }
}
