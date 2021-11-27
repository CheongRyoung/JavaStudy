package question;

import java.util.Stack;

public class Q7Cranegame {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,100,0,31}, {0,22,5,0,100}, {4,22,4,4,22}, {31,5,100,31,100}};
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4};

		System.out.println(solution(board, moves));
	}
	

	    public static int solution(int[][] board, int[] moves) {
	    	Stack<Integer> stack = new Stack<Integer>();
	    	stack.push(0);
	    	int answer = 0;
	       
	    	for (int i : moves) {
	    		for ( int j = 0; j<board.length; j++) {
	                
	            	if (board[j][i-1] == 0) {
	                	continue;
	                }
	                int temp = board[j][i-1];
	                if ( stack.peek() == temp) {
	                	answer += 2;
                        stack.pop();
                        board[j][i-1] = 0;
                        break;
	                } else {
	                	stack.push(temp);
                        board[j][i-1] = 0;
                        break;
	                }
	                
	                
	            }
	    		
	    	}
	    	return answer;
	    }
	}


