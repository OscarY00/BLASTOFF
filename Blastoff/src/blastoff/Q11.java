package blastoff;


public class Q11 {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4};
		int B[] = {1,3,5,8};
		
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<4;j++) {
				if(B[j] == A[i]) {
					System.out.println(B[j]);
				}
			}
		}
	}
}
