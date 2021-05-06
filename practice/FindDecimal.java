package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12921
public class FindDecimal {

	public static void main(String[] args) {
		int n=10;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int answer=1; //이미 소수로 포함된 후 시작
		
		for(int i=3; i<=n; i++) {
			for(int j=2; j<i; j++) {
				if(i>2 && i%2 == 0) break;
				else if(i%j==0) break;
				else if(j==i-1) {
					answer++;
				}
			}
		}
		return answer;
	}

}
//2 3 5 7 배수는 모두 지움
