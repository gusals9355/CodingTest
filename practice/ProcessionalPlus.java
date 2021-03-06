package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12950
public class ProcessionalPlus {

	public static void main(String[] args) {
		int[][] arr1 = { {1,2},{2,3} };
		int[][] arr2 = { {3,4},{5,6} };
		int[][] result = solution(arr1, arr2);
		for (int[] i : result) {
			for (int j : i) {
				System.out.println(j);
			}
		}
		
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1.length];
        
        for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr1.length; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        
        return answer;
    }

}
