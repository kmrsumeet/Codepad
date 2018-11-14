import java.util.Scanner;

public class PowerOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int x = 10;
		int pow = 1;
		while(pow<y)
		{
			pow = pow*x;
		}
		if(pow == y)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
