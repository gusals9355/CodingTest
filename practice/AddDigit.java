package practice;

import java.util.stream.Stream;

public class AddDigit {

	public static void main(String[] args) {
		int n = 987;
		solution(n);
	}
	
	public static int solution(int n) {
		int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		int sum=0;
		
		for (int i : arr) {
			sum+=i;
		}
		
//		System.out.println(sum);
		return sum;
	}
}
