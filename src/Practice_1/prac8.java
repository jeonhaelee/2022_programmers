package Practice_1;

public class prac8 {
	public static void main(String[] args) {
		long n = 12345;
		String number = String.valueOf(n);
		String[] numbers = number.split("");
		int[] answer = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			answer[i] = Integer.parseInt(numbers[numbers.length-1-i]);
			System.out.println(answer[i]);
		}
	}
}
