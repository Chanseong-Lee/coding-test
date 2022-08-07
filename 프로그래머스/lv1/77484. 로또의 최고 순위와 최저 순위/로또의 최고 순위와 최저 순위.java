class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
		
        int[] answer = new int[2];
        
        int zeroCnt = checkZero(lottos);
        int matchCnt = checkMatch(lottos, win_nums);
        answer = maxMinPrize(zeroCnt, matchCnt, lottos.length);
        
        return answer;
    }
	
	public int checkZero(int[] lottos) {
		int zeroCnt = 0;
		for(int i = 0; i < lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zeroCnt++;
        	}
        }
		return zeroCnt;
	}
	
	public int checkMatch(int[] lottos, int[] win_nums) {
		int matchCnt = 0;
		for(int i = 0; i < lottos.length; i++) {
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) {
        			matchCnt++;
        		}
        	}
        }
		return matchCnt;
	}
	
	public int printPrize(int matchCnt) {
		int prize = 0;
		switch (matchCnt) {
		case 6:
			prize = 1;
			break;
		case 5:
			prize = 2;
			break;
		case 4:
			prize = 3;
			break;
		case 3:
			prize = 4;
			break;
		case 2:
			prize = 5;
			break;
		case 1:
            prize = 6;
			break;   
		case 0:
			prize = 7;
			break;
		}
		
		return prize;
	}
	
	public int[] maxMinPrize(int zeroCnt, int matchCnt, int arrLength) {
		int[] maxMinArr = new int[2];
		int min = printPrize(matchCnt);
		if(min > arrLength) {
			min = arrLength;
		}
		int max = printPrize(matchCnt) - zeroCnt;
		if(max > arrLength) {
			max = arrLength;
		}
		maxMinArr[0] = max;
		maxMinArr[1] = min;
		return maxMinArr;
	}
}