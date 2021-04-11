package practice;

import java.util.ArrayList;
import java.util.TreeSet;

//https://programmers.co.kr/learn/courses/30/lessons/1845
public class Phoneketmon {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
		int answer = 0;
		int cnt=0;
		int array[] = new int [nums.length/2]; // 배열 크기를 nums의 반 크기만큼 지정
		TreeSet<Integer> dogam = new TreeSet<Integer>(); // 도감 트리셋 생성
		
		for(int i=0; i<nums.length && cnt<array.length; i++) { 
			 if(dogam.add(nums[i])) {
				 array[cnt] = nums[i];  //dogam에 들어 가는 값을 배열에 넣음
				 cnt++;
			 }
		}
		answer = dogam.size();
		return answer;
	}

}
