package Practice_1;

//두 정수 left와 right가 매개변수로 주어집니다.
//left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
//약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

public class prac2 {
	public int solution(int left, int right) {
		int answer = 0;
		int a = left;
		int b = right;
		for (int i = a; i <= b; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum += 1;
				}
			}
			if (sum % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		return answer;
	}
}
