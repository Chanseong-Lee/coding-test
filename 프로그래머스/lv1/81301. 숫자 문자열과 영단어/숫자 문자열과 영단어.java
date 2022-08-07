class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = new String[10];
		String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};  
		for (int i = 0; i < 10; i++) {
			numbers[i] = Integer.toString(i);
		}
		
		for(int i = 0; i < 10; i++) {
			s = s.replace(words[i], numbers[i]);
		}
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}