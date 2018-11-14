import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		char s1[] = str.toCharArray();
		for(int i = str.length()-1;i>=0;i--){
			System.out.print(s1[i]);
		}
	}

}
