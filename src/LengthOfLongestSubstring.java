import java.util.HashMap;
/*Longest substring with no repeating characters */
public class LengthOfLongestSubstring {
	
	public static int lengthOfLongestSubstring(String s){
		int n = s.length();
		int ans = 0,i=0;
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(int j = 0;j<n;j++){
			if(hmap.containsKey(s.charAt(j))){
				i = Math.max(hmap.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j-i+1);
			hmap.put(s.charAt(j), j+1);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcde";
		int ans = lengthOfLongestSubstring(s);
		System.out.println(ans);
	}

}
