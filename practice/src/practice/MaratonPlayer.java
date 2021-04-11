package practice;

import java.util.HashMap;

//https://programmers.co.kr/learn/courses/30/lessons/42576
public class MaratonPlayer {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"}; //참여자
		String[] completion = {"stanko", "ana", "mislav"};  //완주자
		
		System.out.println(Solution(participant, completion));
	}
	
	public static String Solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0; i<participant.length; i++) {
			map.put(i, participant[i]);
		}
		
		for(int i=0; i<completion.length; i++) {
			for(int j=0; j<participant.length; j++) {
				if(completion[i] == map.get(j)) {
					map.remove(j);
					break;
				}
			}
		}
		
		for(Integer i : map.keySet()) { //남은 값을 확인해야함
				answer = map.get(i);
		}
			
		return answer;
	}
}
