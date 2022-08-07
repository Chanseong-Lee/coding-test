class Solution {
    	public String solution(int[] numbers, String hand) {
		StringBuffer answer = new StringBuffer();
		
		// 오른손잡이 == right
		// 왼손잡이 == left
		// 같은거리라면 주 손 사용
		final int keyPad[][] = {
					{1, 2, 3},	//0 	00 01 02
					{4, 5, 6}, 	//1		10 11 12
					{7, 8, 9},	//2		20 21 22
					{-1, 0, -1}	//3		30 31 32
				};
		int[] leftLocation = {3,0};
		int[] rightLocation = {3,2};
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < keyPad.length; j++) {
				for(int k = 0; k < keyPad[j].length; k++) {
					if(numbers[i]==keyPad[j][k]) {
						if(numbers[i] == 1 || numbers[i] ==4 || numbers[i] == 7) {
							leftLocation[0] = j;
							leftLocation[1] = k;
							answer.append("L");
                            break;
						}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
							rightLocation[0] = j;
							rightLocation[1] = k;
							answer.append("R");
                            break;
						}else {
							int leftDistance = Math.abs(j-leftLocation[0]) + Math.abs(k-leftLocation[1]);
							int rightDistance = Math.abs(j-rightLocation[0]) + Math.abs(k-rightLocation[1]);
							if(leftDistance == rightDistance) { //거리가 같다면
								if(hand.equals("left")) {	//왼손잡이일때
									leftLocation[0] = j;
									leftLocation[1] = k;
									answer.append("L");
                                    break;
								}else { //오른손잡이일때
									rightLocation[0] = j;
									rightLocation[1] = k;
									answer.append("R");
                                    break;
								}
							}else if(leftDistance > rightDistance) { //오른쪽이 더 가깝다면
								rightLocation[0] = j;
								rightLocation[1] = k;
								answer.append("R");
                                break;
							}else { //왼쪽이 더 가깝다면
								leftLocation[0] = j;
								leftLocation[1] = k;
								answer.append("L");
                                break;
							}
						}
					}
				}
			}
		}
		return answer.toString();
	}
}