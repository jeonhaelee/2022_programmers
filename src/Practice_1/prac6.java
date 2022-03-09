package Practice_1;

class Prac6 {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        String wd = "";
        if(arr[0]=="-") {
        	wd = "-";
        	for(int i = 1; i<arr.length; i++) {
        		wd = wd + arr[i];
        	}
        	answer = Integer.parseInt(wd);
        } else {
        	for(int i = 0; i<arr.length; i++) {
        		wd = wd + arr[i];
        	}
        	answer = Integer.parseInt(wd);
        }
        return answer;
    }
}

