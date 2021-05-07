package practice;

//https://programmers.co.kr/learn/courses/30/lessons/12930
public class CreateRandomCharacter {

	public static void main(String[] args) {
		String s = "try hello world";
		solution(s);
	}
	
    public static String solution(String s) {
        String answer = "";
        String s1 = s.toUpperCase();
        String[] sArr = s1.split("");
        int cnt = 0;
        
        for(int i=0; i<sArr.length; i++) {
        	
        	
        	if(cnt % 2 != 0) answer+=sArr[i].toLowerCase();
        	else answer+= sArr[i];
        	cnt++;
        	if(sArr[i].equals(" ")) cnt=0;
        }
        System.out.println(answer);
        return answer;
    }
    
}
