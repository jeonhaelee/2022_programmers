package Practice_1;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

// 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
// 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
// 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
// 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
// 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

class Prac1 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int per1 = 0;
        int per2 = 0;
        int per3 = 0;
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        for (int i = 0; i < answers.length;i++) {
        	if ( person1[i]==answers[i] ) {
        		per1++;
        	}
        	if ( person2[i]==answers[i] ) {
        		per2++;
        	}
        	if ( person3[i]==answers[i] ) {
        		per3++;
        	}
        }
       if (per1 > per2 && per1 > per3) {
    	   answer[0] = 1;
       }
       int[] sss = {per1,per2,per3};
       int max = sss[0];
       for (int i = 0; i < 3; i++) {
    	   if (Math.max(sss[i], max) == sss[i]) {
    		   max = sss[i];
    	   }
       }
      
       return answer;
    }
}
