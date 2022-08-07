class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = getArr(arr);
        }
        System.out.println(answer);
        return answer;
    }
    
    public static int[] getArr(int[] arr){
        int min = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        int[] newArr = new int[arr.length-1];
        int index = 0;
        for(int i = 0; i < newArr.length; i++){
            if(arr[index] == min){
                index++;
                i--;
                continue;
            }
            newArr[i] = arr[index];
            index++;
        }
        return newArr;
    }
}