import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class MinMinAverageStudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<>();
		hmap.put("sumeet", 50);
		hmap.put("raghav", 10);
		hmap.put("sadda", 70);
		hmap.put("chadda", 90);
		hmap.put("chadda", 20);
		hmap.put("honey", 75);
		hmap.put("raghav", 25);
		hmap.put("sushil", 95);
		hmap.put("raghav", 25);
		hmap.put("sushil", 90);
		
		
		
		/*ArrayList<String> list = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : hmap.entrySet()){
			if(!list.contains(entry.getKey())){
				list.add(entry.getKey());
			}
		}*/
		int maxAvg = 0;
		String maxStd = "";
		HashMap<String,Integer> map1 = new HashMap<>();
		HashMap<String,Integer> map2 = new HashMap<>();
		HashSet<String> hset = new HashSet<>();
		
			for(Map.Entry<String, Integer> entry : hmap.entrySet()){
				if(hset.contains(entry.getKey()) )
				{
					int mval = map1.get(entry.getKey());
					int mcount = map2.get(entry.getKey());
					int newVal = mval+entry.getValue();
					int newCount = mcount + 1;
					int newAvg = newVal/newCount;
					if(newAvg > maxAvg){maxAvg = newAvg; maxStd = entry.getKey();} 
					map1.put(entry.getKey(), mval);
					map2.put(entry.getKey(), mcount);
				}
				else {
					hset.add(entry.getKey());
					if(entry.getValue() > maxAvg){maxAvg = entry.getValue(); maxStd = entry.getKey();} 
					map1.put(entry.getKey(), entry.getValue());
					map2.put(entry.getKey(), 1);
				}
			}
		
			System.out.println("maxAvg:  "+maxAvg);
			System.out.println("maxStudnt: "+ maxStd);
			
		
		
		
		//HashMap<String, Integer> hmap1 = new HashMap<>();
		

	}

}
