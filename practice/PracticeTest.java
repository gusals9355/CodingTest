package practice;

//https://programmers.co.kr/learn/courses/30/lessons/42840
public class PracticeTest {

	public static void main(String[] args) {
		int[] answers= {1,2,3,4,5};
		solution(answers);
	}
	
	public static int[] solution(int[] answers) {
		int[] answer;
		int[] one = {1,2,3,4,5};  //5
		int[] two = {2,1,2,3,2,4,2,5};  //8
		int[] three = {3,3,1,1,2,2,4,4,5,5}; //10
		int[] cnt = new int[3]; // 점수  0 1 2\
		int cnt2 = 0;
		int cnt3 = 0;
		int max = 0;
		
		for(int i=0; i<answers.length; i++) {
			
			if(answers[i] == one[i%5]) 
				cnt[0]++;
			if(answers[i] == two[i%8])
				cnt[1]++;
			if(answers[i] == three[i%10])
				cnt[2]++;
		}
		
		for (int i : cnt) {
			System.out.print(i);
		}
		
		max = getMax(cnt);
		
		
		for (int i : cnt) { //answer 배열 크기 지정
			if(max == i) {
				cnt2++;
			}
		}
		answer = new int[cnt2];
		
		for(int i=0; i<3; i++) {//max값과 cnt비교
			if(max == cnt[i]) {
				answer[cnt3] = i+1;
				cnt3++;
			}
		}
		
		for (int i : answer) {
			System.out.println(" " + i);
		}
		
		return answer; //젤 많이 맞은사람들
	}
	
	public static int getMax(int[] cnt) { //젤 높은 점수 맞은 사람 구하는 메소드
		int temp = 0;
		
		for (int i : cnt) {
			if(temp<i) temp = i;
		}
		return temp;
	}
}
