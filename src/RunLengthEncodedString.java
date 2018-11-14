import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunLengthEncodedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char s1[] = str.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<>();
		for(int i = 0;i<str.length();i++){
			if(hmap.containsKey(s1[i])){
				hmap.put(s1[i], hmap.get(s1[i])+1);
			}
			else
				hmap.put(s1[i],1);
		}
		for(Map.Entry<Character, Integer> entry: hmap.entrySet()){
			System.out.print(entry.getKey()+""+entry.getValue());
		}
	}

}
