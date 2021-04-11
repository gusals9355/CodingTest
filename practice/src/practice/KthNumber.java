package practice;

import java.util.Arrays;

public class KthNumber {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        
        int[] answer = solution(array, commands);

        System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) { 
				
			int imsi[] = new int[commands[i][1] - commands[i][0] + 1]; //임시 배열에 값을 커맨드 자르는값만큼 넣음
//			for(int j=commands[i][0]; j<commands[i][1]; j++)
			int k = commands[i][0]-1; // 시작하는 위치 2지만 k는 배열안에 들어가서 -1번째를 해줘야함
			for(int j=0; j<imsi.length; j++) {
				imsi[j] = array[k]; //자른 값을 넣어야함
				k++; // j가 늘어나면 k도 같이 늘어남
			}// 그다음 해야할거 : 정렬
			Arrays.sort(imsi);
			// 정렬 했으니 commands[i][2]값을 imsi배열에 뽑아야한다.
			answer[i] = imsi[commands[i][2]-1]; //imsi 배열에 commands[i][2]값을 맞게 넣으려면 -1을 해야한다.
			
		}
		
//		commands[?][0] => arrays에서 새로운 배열이 시작하는 위치
//		commands[?][1] => arrays에서 새로운 배열이 끝나는 위치
//		commands[?][2] => 새로운 배열에서 고를 숫자의 번호
		
		return answer;
	}
}
