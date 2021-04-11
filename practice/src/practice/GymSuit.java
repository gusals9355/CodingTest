package practice;

public class GymSuit {

	public static void main(String[] args) {
		int n=3;
		int[] lost = {3};
		int[] reserve = {1};
		System.out.println(solution(n, lost, reserve));
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0; //수업을 들을수 있는 학생 수
		answer = n - lost.length; // 총 학생수에서 체육복 잃어버린사람을 뺌
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			if(reserve[i] == lost[i]+1 || reserve[i] == lost[i]-1) { // 여벌이 있는 학생기준으로 전번호나 앞번호 잃어버린사람이 있다면
				cnt++;  //잃어버린 사람이 여벌의 옷을 받음
				if(i == lost.length-1 || i == reserve.length-1 ) {
					break;
				} 
			}
			if(reserve[i] != lost[i]+1 && reserve[i] != lost[i]-1) {
				break;
			}
		}
		answer += cnt;
		
		return answer;
	}

}
