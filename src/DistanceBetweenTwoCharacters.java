import java.util.LinkedHashMap;
import java.util.Scanner;

public class DistanceBetweenTwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char s1[] = str.toCharArray();
		//LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
		int x = -1, x1 = -1;
		int tempDistance = 0;
		int minDistance = Integer.MAX_VALUE;
		for(int i = 0;i<str.length();i++){
			if(s1[i] == 's'){
				x = i;
			}
			if(s1[i] == 't'){
				x1 = i;
			}
			if(x!=-1 && x1!=-1){
				tempDistance = (int) Math.abs(x1-x);
				if(tempDistance < minDistance)
					minDistance = tempDistance;
			}
			
		}
		System.out.println(minDistance);
	}
}
