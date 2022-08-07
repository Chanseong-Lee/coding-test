class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int digits[] = {0,1,2,3,4,5,6,7,8,9};
        for(int number : numbers) {
        	for(int i = 0; i < digits.length; i++) {
        		if(number == digits[i]) {
        			digits[i] = 0;
        		}
        	}
        }
        
        for(int digit : digits) {
        	answer += digit;
        }
        
        return answer;
    }
}