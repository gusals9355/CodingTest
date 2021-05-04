package practice;

import java.util.ArrayList;
import java.util.List;

public class LottoRank {

	public static void main(String[] args) {
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		solution(lottos, win_nums);
	}
	
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        List<Integer> list =new ArrayList<>();
        List<Integer> list2 =new ArrayList<>();
        
        for(int i=0; i<lottos.length; i++) {
        	list.add(lottos[i]);
        	list2.add(win_nums[i]);
        }
        
        for(int i=0; i<list.size(); i++) {
        	for(int j=0; j<list.size(); j++) {
        		
        		if(list.get(i) == 0) {
        			answer[0]++;
        			break;
        		}
        		else if(list.get(i) == list2.get(j)) {
        			answer[0]++;
        			answer[1]++;
        			list.remove(i);
        			list2.remove(j);
        			j=0;
        			i=0;
        		}
        		
        	}
        }
        
        for (int i : answer) {
			System.out.println(i);
		}
        
        for(int i=0; i<answer.length; i++) {
        	switch (answer[i]) {
			case 6:
				answer[i]=1;
				break;
			case 5:
				answer[i]=2;
				break;
			case 4:
				answer[i]=3;
				break;
			case 3:
				answer[i]=4;
				break;
			case 2:
				answer[i]=5;
				break;
			default:
				answer[i]=6;
			}
        }
        
        for (int i : answer) {
			System.out.println(i);
		}
        
        return answer;
    }
}
