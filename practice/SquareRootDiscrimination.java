package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12934
public class SquareRootDiscrimination {

	public static void main(String[] args) {
		long n = 1;
		System.out.println(solution(n));
	}
	
    public static long solution(long n) {
        long cnt=2;
        long m = (long)Math.sqrt(n);
        
        if(n==1) return 4;
        if(n <4) return -1;
        
        while(cnt <= m) {
        	if(cnt*cnt == n) { //제곱근이라면
        		cnt++;
        		return cnt*=cnt;
        	}else {
        		cnt++;
        	}
        }
        
        return -1;
    }

}
