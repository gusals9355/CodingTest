package practice;

public class CreateRandomCharacter {

	public static void main(String[] args) {
		String s = "      hello world";
		solution(s);
	}
	
    public static String solution(String s) {
        String answer = "";
        char temp;
        int cnt=0;
        
        for(int i=0; i<s.length(); i++) {
        	temp = s.charAt(i);
        	if(temp != ' ') { // 공백이 없을 경우
        		if(cnt%2 == 0) { //짝수번째
        			answer= answer + (char)(temp-32); //대문자
        		}else {
        			answer = answer + temp;
        		}
        		cnt++;
        	}else { //공백이 있을경우
        		cnt =0;
        		answer = answer + " ";
        	}
        }
//        System.out.print(answer);
        
        return answer;
    }
    
}
