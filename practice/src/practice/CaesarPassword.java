package practice;

public class CaesarPassword {

	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		solution(s, n);
	}
	
    public static String solution(String s, int n) {
        String answer = "";
        char[] c = new char[s.length()];

        for(int i=0; i<c.length; i++) {
        	c[i] = s.charAt(i);
        	while(true) {
        		if(c[i] == ' ') {
        			answer += c[i];
        		}
        	}
        }
        
        
        
        
        return answer;
    }
	
}
