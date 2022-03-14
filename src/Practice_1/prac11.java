package Practice_1;

public class prac11 {
	public static void main(String[] args) {
		String new_id = "123_.def";
		String answer = "";
		
		

//		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		new_id = new_id.toLowerCase();

		
//		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		for (int i = 0; i < new_id.length(); i++) {
			if(97<=(int)new_id.charAt(i)&&(int)new_id.charAt(i)<=122) {
				answer += new_id.charAt(i);
			}else if(Character.isDigit(new_id.charAt(i))) {
				answer += new_id.charAt(i);
			}else if(new_id.charAt(i)=='-') {
				answer += new_id.charAt(i);
			}else if(new_id.charAt(i)=='_') {
				answer += new_id.charAt(i);
			}else if(new_id.charAt(i)=='.') {
				answer += new_id.charAt(i);
			}else {
				answer += "";
			}
		}
		
		
//		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		String answer2 = ""; 
		answer2 += answer.charAt(0);
		for (int i = 1; i < answer.length(); i++) {
			if (answer.charAt(i) == '.') {
				if (answer.charAt(i) == answer.charAt(i - 1)) {
					answer2 += "";
				}else {
					answer2 += answer.charAt(i);
				}
			}else {
				answer2 += answer.charAt(i);
			}

		}
		
		
//		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		String answer3 = ""; 
		if(answer2.charAt(0)=='.') {
			answer3 += "";
		}else {
			answer3 += answer2.charAt(0);
		}
		for (int i = 1; i < answer2.length()-1; i++) {
			answer3 += answer2.charAt(i);
		}
		if(answer2.charAt(answer2.length()-1)=='.') {
			answer3 += "";
		}else {
			answer3 += answer2.charAt(answer2.length()-1);
		}
		
		
//		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if (answer3 == "") {
			answer3 += "a";
		}
		
//		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		String answer4 = "";
		if(answer3.length()>=16) {
			for(int i=0; i<15; i++) {
				answer4 += answer3.charAt(i);
			}
		}else {
			answer4 = answer3;
		}
		
		
//	    만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		String answer5 = "";
		for (int i = 0; i < answer4.length()-1; i++) {
			answer5 += answer4.charAt(i);
		}
		
		if(answer4.charAt(answer4.length()-1)=='.') {
			answer5 += "";
		}else {
			answer5 += answer4.charAt(answer4.length()-1);
		}
		
		
		
//		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if(answer5.length()==2) {
			answer5 += answer5.charAt(answer5.length()-1);
		}else if(answer5.length()==1) {
			answer5 += answer5.charAt(answer5.length()-1);
			answer5 += answer5.charAt(answer5.length()-1);
		}
			
		System.out.println(answer5);
	}
}
