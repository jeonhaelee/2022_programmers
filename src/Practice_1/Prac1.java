package Practice_1;

// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

public class prac1 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        for (int m = 0; m < commands.length ; m++ ) {
        	int i = commands[m][0];
        	int j = commands[m][1];
        	int k = commands[m][2];
        	int[] arr = {};
        	for ( int n = i-1 ; n <= j; n++) {
        		arr[n-i+1] = array[n];
        	}
        	answer[m] = arr[k];
        }return answer;
}}
