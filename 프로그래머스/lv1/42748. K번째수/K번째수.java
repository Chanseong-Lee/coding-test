class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
		int answer[] = new int[commands.length];
		int i, j, k;
		
		for(int row = 0; row < commands.length; row++) {
			i = commands[row][0] - 1;
			j = commands[row][1] - 1;
			k = commands[row][2] - 1;
			
			int[] temp = new int[j - i + 1];
			int index = 0;
			for(int h = i; h <= j; h++) {
				temp[index] = array[h];
				index++;
			}
			temp = sortArr(temp);
			answer[row] = temp[k];
		}
		return answer;
	}
	
	public static int[] sortArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1 ; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
}