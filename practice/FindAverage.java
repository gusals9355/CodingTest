package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12944
public class FindAverage {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(solution(arr));

	}
    public static double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        
        for (int i : arr) {
			sum+=i;
		}
        
        return answer=sum/arr.length;
    }

}
