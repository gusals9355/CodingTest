package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12918
public class HandlingStrings {

	public static void main(String[] args) {
		String s ="1231";
		System.out.println(solution(s));
	}
	
    public static boolean solution(String s) {
    	
    	if(s.length() != 4 && s.length() != 6) return false;
    		
        try {
        	Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
        return true;
    }
}
