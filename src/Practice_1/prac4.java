package Practice_1;

import java.util.Scanner;

public class prac4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 가로 길이 입력받기
		int m = sc.nextInt();	// 세로 길이 입력받기
		String width = "";			// 가로 만들어서 넣을 공간 만들기
		for (int j=1; j<=n; j++) {	// 가로 길이만큼 * 넣기
			width += "*";
		}
		for (int i=1; i<=m; i++) {	// 세로 길이만큼 가로 출력하기
			System.out.println(width);
		}
	}
}
