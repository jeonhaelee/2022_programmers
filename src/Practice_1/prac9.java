package Practice_1;

import java.util.Arrays;

public class prac9 {
	public static void main(String[] args) {
		String sentence = "ZbcddfdsGERefg";
		char[] arr = sentence.toCharArray();
		Arrays.sort(arr);
		char[] arr2 = new char[sentence.length()];
		for(int i=0; i<sentence.length();i++) {
			arr2[sentence.length()-1-i] = arr[i];
		}
		String answer = new String(arr2);
		System.out.println(answer);
	}
}
