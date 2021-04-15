package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12934
public class SquareRootDiscrimination {

	public static void main(String[] args) {
		long n = 3;
		System.out.println(solution(n));
	}
	
    public static long solution(long n) {
        long cnt=2;
        while(true) {
        	if(n <4) return cnt=-1;
        	
        	if(cnt*cnt == n) { //제곱근이라면
        		cnt++;
        		return cnt*=cnt;
        	}else {
        		cnt++;
        	}
        }
    }

}
