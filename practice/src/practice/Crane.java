package practice;

//https://programmers.co.kr/learn/courses/30/lessons/64061
public class Crane {
	public static void main(String[] args) {
		int[][] bord = { {0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1} };
		int[] move = { 1,5,3,5,1,2,1,4 };
		
		System.out.println(solution(bord, move));
	}
	
	
	public static int solution(int[][] board, int[] moves) {
	    int leng = board.length;
	    int[] basket = new int[leng*leng + 1];
	    int cnt = 0;
	    int answer = 0; // 없앤 갯수 적기
	
	    for(int i = 0; i < moves.length;i++){
	        
	        int depth = 0; // 깊이 0부터
	        while(true){
	            if(depth == 5) break; //끝까지 들어갔을 경우 break
	            if(board[depth][moves[i]-1] == 0){ // 0깊이 들어갔지만 인형이 없는 경우
	                depth++;						// +1깊이 들어감
	            }else{				// 인형이 있는 경우
	                basket[cnt] =board[depth][moves[i]-1]; 	//바구니에 인형을 넣음
	                board[depth][moves[i]-1] = 0;	// 인형이 원래 잇던 위치를 0으로 만듬
	                cnt++; // 바구니 위치 +1
	                if(cnt>1){ // 인형이 2개 이상 들었을때
	                    if(basket[cnt-2] == basket[cnt-1]){ // 바구니1위치와 2위치가 같다면 (인형 터뜨리는 과정)
	                        basket[cnt-2] = 0; // 둘다 없앰
	                        basket[cnt-1] = 0;
	                        answer+=2;
	                        cnt-=2;
	                    }
	                }
	                break; // 인형을 하나 뽑았다면 break
	            }
	        }
	    }
	    return answer;
	}
}


