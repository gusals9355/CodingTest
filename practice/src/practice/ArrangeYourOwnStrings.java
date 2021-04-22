package practice;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12915
public class ArrangeYourOwnStrings {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car","kar"};
		int n=2;
		solution(strings, n);
	}
	
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        int cnt = 0;
        
        for(int i=0; i<strings.length-1; i++) {
        	int tmp = i;
        	for(int j=i+1; j<strings.length; j++) {
        		if(strings[tmp].charAt(n) > strings[j].charAt(n)) 
        			tmp=j;
        	}
        	String temp = strings[i];
        	strings[i] = strings[tmp];
        	strings[tmp] = temp;
        	answer[cnt++] = strings[i];
        	strings[i] = "a";
        	Arrays.sort(strings);
        }
        answer[cnt] = strings[strings.length-1];
//        for (String s : answer) {
//			System.out.println(s);
//		}
        
        return answer;
    }
}
