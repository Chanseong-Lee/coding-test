import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
		//중복을 피하기 위해 set으로
		HashSet<Integer> pokemons = new HashSet<>();
		//set에 값을 넣는데 성공한 횟수
        int cnt = 0;
        //반복문으로 nums순회
		for(int num : nums) {
            //현재 반복문 이전의 set의 길이
			int setSize = pokemons.size();
            //cnt는 nums.length/2의 길이를 넘으면 안된다.
			if(cnt == (nums.length / 2)) {
				break;
			}
			
			//배열에서 한개씩 뽑아 set에 담는다.
			if(pokemons.add(num)){
                cnt++;
            }
                
			
		}
		answer = cnt;
        return answer;
    }
}