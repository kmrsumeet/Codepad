import java.util.Arrays;

public class PascalTriangleNCR {
	static int nCr(int n, int r){
		int C[] = new int[r+1];
		Arrays.fill(C, 0);
		C[0] = 1;
		for(int i = 1;i<=n;i++){
			for(int j = Math.min(i,r);j>0;j--){
				C[j] = C[j] + C[j-1]; 
			}
		}
		return C[r];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5,r = 2;
		System.out.println(nCr(n,r));

	}

}
