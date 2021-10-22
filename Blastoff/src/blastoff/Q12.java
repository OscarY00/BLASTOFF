package blastoff;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {

		int[] A = {1,2,3,4};
		int[] B = {1,2,5,8};
		
		int lenA = A.length;
		int lenB = B.length;
		int[] C = new int[lenA + lenB];
		System.arraycopy(A, 0, C, 0, lenA);
		System.arraycopy(B, 0, C, lenA, lenB);
	
		System.out.println(Arrays.toString(C));
	}	
	
}
