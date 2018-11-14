import java.util.Scanner;

public class MatrixLeftToRight {
	
	static boolean exists(int m, int n, int i, int j){
		return (i>=0 && i<m) && (j>=0 && j<m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		for(int i = m-1;i>=0;i--){
			for(int j = 0;j<i;j++){
				
			}
		}
	}

}
