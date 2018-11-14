import java.util.HashSet;
import java.util.Scanner;

public class PairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i = 0;i<n;i++){
			int temp = k - arr[i];
			if(temp >= 0 && set.contains(temp)){
				System.out.println(arr[i]+ " " + temp);
			}
			set.add(arr[i]);
		}
	}

}
