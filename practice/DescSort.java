package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class DescSort {

	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
		
	}
	
    public static long solution(long n) {
        long[] arr = Stream.of(String.valueOf(n).split("")).mapToLong(Long::parseLong).toArray();
        ArrayList<Long> list = new ArrayList<Long>();
        
        for (Long i : arr) {
			list.add(i);
		}
        list.sort(Collections.reverseOrder());
        
        Long[] array = list.toArray(new Long[list.size()]);
        String s="";
        for(int i=0; i<array.length; i++) {
        	s+=array[i];
        }
        
        long answer = Long.parseLong(s);
        
        return answer;
    }
}
