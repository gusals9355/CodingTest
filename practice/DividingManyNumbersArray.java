package practice;

import java.util.ArrayList;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/12910
public class DividingManyNumbersArray {

	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor = 10;
		solution(arr, divisor);
	}
	
    public static ArrayList<Integer> solution(int[] arr, int divisor) {
    	
    	ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] % divisor == 0)
        		list.add(arr[i]);
        }
        Collections.sort(list);
        
        if(list.isEmpty() == true) list.add(-1);
        return list;
    }

}