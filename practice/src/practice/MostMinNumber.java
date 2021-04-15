package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12935
public class MostMinNumber {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		solution(arr);
	}
	
	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length-1];
		int min=arr[0];
		int cnt = 0;
		
		if(arr.length == 1) { //arr배열이 하나라면
			answer = new int[1];
			answer[0] = -1;
		} else {
			for(int i=0; i<arr.length; i++) { // 제일 작은수 찾기
				if(min > arr[i]) min = arr[i];
			}
			
			for(int i=0; i<arr.length; i++) { 
				if(arr[i] == min) continue;
				answer[cnt++] = arr[i];
			}
			
//			for (int i : answer) {
//				System.out.println(i);
//			}
		}
		
		return answer;
	}
}
