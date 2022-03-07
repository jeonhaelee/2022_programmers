package Practice_1;

import java.util.Arrays;

public class prac5 {
	public static void main(String[] args) {

	}
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
        	if(sum>budget) {
        		break;
        	}
        	sum += d[i];
        	answer += 1;
        }
        return answer;
    }
}