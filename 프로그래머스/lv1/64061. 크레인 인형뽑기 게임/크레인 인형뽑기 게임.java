import java.util.*;
class Solution {
    	Stack<Integer> stacker = new Stack<>();

	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		for (int k = 0; k < moves.length; k++) {
			Loop1 :
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if (moves[k] == (j + 1) && board[i][j] != 0) {
						answer = getDall(board[i][j], answer);
						board[i][j] = 0;
						break Loop1;
					}
				}
			}
		}

		return answer;
	}

	public int getDall(int digit, int answer) {
		int lastDigit = -1;
		if (!stacker.isEmpty()) {
			lastDigit = stacker.peek();
			if (lastDigit == digit) {
				stacker.pop();
				answer+=2;
			} else {
				stacker.push(digit);
			}
		}else {
			stacker.push(digit);
		}

		return answer;
	}
}