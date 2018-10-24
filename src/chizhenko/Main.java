package chizhenko;

public class Main {

	public static void main(String[] args) {

		int max = 0;
		
		for (int i=100; i<=999;i++) {
			for(int j = i;j<=999;j++) {
				max = (itsPallindrome(i,j))?(i * j):max;		
			}
		}
		
		System.out.println(max);
	}
	
	public static boolean itsPallindrome(int pi, int pj) {
		
		String str1 = Integer.toString(pi * pj);
		String str2 = "";
		
		for (int i=str1.length()-1;i>=0;i-- ) {
			str2 = str2 + str1.charAt(i);
		}
			
		return (str1.equals(str2)?true:false);
	}

}
