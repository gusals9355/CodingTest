package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12928
public class SumOfFactors {

	public static void main(String[] args) {
		int n=3000;
		solution(n);
	}
	
    public static int solution(int n) {
        int sum = 0;
        int cnt=1;
        
        if(n == 0) return 0;
        
        while(true) {
        	if(n%cnt ==0) sum+=cnt;
        	if(cnt == n) break;
        	cnt++;
        }
        
        System.out.println(sum);
        
        return sum;
    }

}
