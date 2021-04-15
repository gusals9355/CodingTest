package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12940
public class MaxCFMinCM { //최대공약수와 최소공배수

	public static void main(String[] args) {
		int n=3;
		int m=5;
		solution(n, m);
	}
	
	public static int[] solution(int n, int m) {
		int cnt = 2;
        int cf=1; //최대공약수
        int cm=1; //최소공배수
        int mok1=n;
        int mok2=m;
        
        if(n>m) {
        	mok1=m;
        	mok2=n;
        }
        
        while(true) {
        	if(mok1%cnt ==0 && mok2%cnt ==0) {
        		cf = cf * cnt;
        		mok1 = mok1/cnt;
        		mok2 = mok2/cnt;
        		cnt=2;
        	} else if(cnt != mok1){
        		cnt++;
        	}
        	
        	if(mok1 == 1) {
        		break;
        	}
        	if(cnt == mok1 && mok2%cnt!=0) {
        		break;
        	}
        }
        
        cm = n*m/cf;
        
        int[] arr = {cf, cm};
        for (int i : arr) System.out.println(i);
        
        return arr;
        
    }

}
