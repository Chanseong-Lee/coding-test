class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase(); //1
        int minLength = 3;
        int maxLength = 15;
        
        answer = answer.replaceAll("[^a-z0-9-_.]", "");//2
        answer = answer.replaceAll("[.]{2,}", ".");   //3
        answer = answer.replaceAll("^[.]|[.]$", ""); //4
        
        if(answer.equals("")){
            answer = "a";
        }//5
        
        if(answer.length() > maxLength){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }//6
        if(answer.length() < minLength){
            while(answer.length() < minLength){
                answer += answer.substring(answer.length()-1);
            }
            
        }//7
        
        return answer;
    }
    
}