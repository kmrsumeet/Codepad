import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			//char s1[] = new char[n];
		String str;
		str = sc.next();
		//char s1[] = str.toCharArray();
			char s1[] = str.toCharArray();
			
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
		for(int i = 0;i<n;i++){
			if(hmap.containsKey(s1[i])){
				hmap.put(s1[i], hmap.get(s1[i])+1);
			}
			else
				hmap.put(s1[i],1);
		}
		int flag = 0;
		for(Map.Entry<Character, Integer> entry: hmap.entrySet()){
				if(entry.getValue()==1){
					System.out.println(entry.getKey());
					flag = 1;
					break;
				}
		}
		
		if(flag == 0){
			System.out.println("-1");
		}
	}
		}

}
