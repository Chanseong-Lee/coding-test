import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //id_list : 아이디 배열
        //report : 신고정보 배열
        //k : 메일이 보내지는 신고 개수의 정수
        
        HashMap<String, HashSet<String>> reportMeInfo = new HashMap<>();
        
        for(String reportedId : id_list) {
        	reportMeInfo.put(reportedId, new HashSet<String>());
        }
        
        
        for(String r : report) {
        	String[] tmp = r.split(" ");
        	String reporter = tmp[0];
        	String reported = tmp[1];
        	reportMeInfo.get(reported).add(reporter);
        }
        
        for(String key : reportMeInfo.keySet()) {
        	if(reportMeInfo.get(key).size() >= k) {
        		//나를 신고한사람에게 메일
        		for(String reporter : reportMeInfo.get(key)) {
        			for(int i = 0; i < id_list.length; i++) {
        				if(reporter.equals(id_list[i])) {
        					answer[i]++;
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }
    

  
}