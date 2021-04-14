package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12940
public class MaxCFMinCM { //최대공약수와 최소공배수

	public static void main(String[] args) {
		
	}
	
	public static int[] solution(int n, int m) {
        int cnt = 2;
        int cf=1; //최대공약수
        int cm=1; //최소공배수
        int min = n;
        int mok1=n;
        int mok2=m;
        if(n<m) min=m;
        while(true) {
        	if(mok1/cnt ==0 || mok2/cnt ==0) {
        		cf = cf * cnt;
        		mok1 = mok1/cnt;
        		mok2 = mok2/cnt;
        		cnt=2;
        	} else {
        		cnt++;
        	}
        	if(cnt == min) break;
        } //마지막 몫이 안나누어 떨어질때
        
    }

}
