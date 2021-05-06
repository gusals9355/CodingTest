package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12917
public class StringDesc {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		solution(s);
	}
	
    public static String solution(String s) {
    	String answer = "";
    	String[] arr = s.split("");
    	List<String> list = new ArrayList<>();
    	
    	for (String string : arr) list.add(string);
    	Collections.sort(list, Collections.reverseOrder());
    	
    	for(String i : list) answer+=i;
//    	System.out.println(answer);
    	return answer;
    }

}
