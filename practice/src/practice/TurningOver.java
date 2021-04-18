package practice;

import java.util.stream.Stream;

public class TurningOver {
	public static void main(String[] args) {
		long n = 12345;
		solution(n);
	}

    public static int[] solution(long n) {
        int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i=0; i<arr.length/2; i++) {
        	int temp=arr[i];
        	arr[i] = arr[arr.length-i-1];
        	arr[arr.length-i-1] = temp;
        }
        
//        for (int i : arr) {
//        	System.out.println(i);
//		}
        
        return arr;
    }
}
