package Practice_1;

import java.util.ArrayList;
import java.util.Arrays;

public class prac12 {
	public static void main(String[] args) {
		int n = 7; 
		int[] lost = {2, 3, 4}; 
		int[] reserve = {1,2,3,6};
		
		Arrays.sort(lost);
		
		ArrayList<Integer> able = new ArrayList<>(); 
		for(int i=0; i<reserve.length; i++) {
			able.add(reserve[i]);
		}
		
		int answer = n - lost.length;
		for(int i=0; i<lost.length; i++) {
			if(able.contains(lost[i])) {
				answer += 1;
				able.remove(able.indexOf(lost[i]));
				lost[i] = 0;
				continue;
			}
		}
		
		for(int i=0; i<lost.length; i++) {
			if(lost[i]==0) {
				continue;
			}
			if(able.contains(lost[i]-1)) {
				answer += 1;
				able.remove(able.indexOf(lost[i]-1));
				continue;
			}else if(able.contains(lost[i]+1)) {
				answer += 1;
				able.remove(able.indexOf(lost[i]+1));
				continue;
			}
		}
		
		System.out.println(answer);
	}
}
