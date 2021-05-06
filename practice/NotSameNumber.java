package practice;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/12906
public class NotSameNumber {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		solution(arr);
		for (int i : solution(arr)) {
			System.out.println(i);
		}
	}
	
	public static Integer[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int cnt=1;
		
		list.add(arr[0]);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				continue;
			}else {
				list.add(arr[i+1]);
				cnt++;
			}
		}
		Integer[] answer = list.toArray(new Integer[(0)]);
		return answer;
	}
}
