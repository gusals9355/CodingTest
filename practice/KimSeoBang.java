package practice;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12919
public class KimSeoBang {

	public static void main(String[] args) {
		String[] seoul = {"Jane","ㅁㄴㅇ","Kim"};
		System.out.println(solution(seoul));
	}
	
    public static String solution(String[] seoul) {
        String answer = "";
//        for(int i=0; i<seoul.length; i++) {
//        	if(seoul[i].equals("Kim")) {
//        		answer = "김서방은 " + i +"에 있다";
//        	}
//        }
        
        int a = Arrays.asList(seoul).indexOf("Kim");
        
        
        return "김서방은 " + a +"에 있다";
    }

}
