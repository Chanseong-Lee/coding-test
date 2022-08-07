import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        StringBuffer answer = new StringBuffer();
		
		HashMap<String, Integer> pMap = new HashMap<>();
		HashMap<String, Integer> cMap = new HashMap<>();
		for(String p : participant) {
			pMap.put(p, pMap.getOrDefault(p, 0) + 1);
		}
		for(String c : completion) {
			cMap.put(c, cMap.getOrDefault(c, 0) + 1);
		}
		
		for(String key : pMap.keySet()) {
			if(!pMap.get(key).equals(cMap.get(key))) {
				answer.append(key);
			}
		}
        return answer.toString();
    }
}