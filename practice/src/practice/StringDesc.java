package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12917
public class StringDesc {

	public static void main(String[] args) {
		String s = "AabBA";
		solution(s);
	}
	
    public static String solution(String s) {
    	char[] answer= new char[s.length()];
    	
    	for(int i=0; i<answer.length; i++) {
    		answer[i] = s.charAt(i);
    	}
    	
    	for(int i=0; i<answer.length-1; i++) {
    		int temp = i;
    		char temp2;
    		
    		for(int j=1; j<answer.length; j++) {
    			if(answer[temp] >= answer[j]){
    				temp2 = answer[j];
    			}
    			temp2 = answer[i];
    			answer[i] = answer[temp];
    			answer[temp] = answer[temp2];
    		}
    	}
    	
    	String a="";
    	for (char c : answer) {
			a+=c;
		}
    	
        return a;
    }

}
