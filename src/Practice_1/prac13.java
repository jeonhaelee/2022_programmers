package Practice_1;

public class prac13 {
	public static void main(String[] args) {
		int[] num = {1,2,7,6,4};
		int answer = 0;
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				for(int k=j+1; k<num.length; k++) {
					if(i!=j && j!=k) {
						if(prime(num[i]+num[j]+num[k])) {
							answer += 1;
						} 
					}
				}
			}
		}
		System.out.println(answer);
	}

	private static boolean prime(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				count += 1;
			}
		}
		if(count==2) {
			return true;
		}else {return false;}
	}
}



