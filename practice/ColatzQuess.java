package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12943
public class ColatzQuess {

	public static void main(String[] args) {
		long num = 626331;
		System.out.println(solution(num));
	}
	
	public static int solution(long num) {
		int cnt=0;
		
		while(true) {
			System.out.println(num);
			if(num==1) return cnt;
			else if(num%2==0) {
				num/=2;
				cnt++;
			}else if(!(num%2==0)) {
				num=num*3+1;
				cnt++;
			}
			
			if(cnt==500) return -1;
			
		}
	}

}
