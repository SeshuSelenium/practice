package seleniumMaven.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HowToFindDuplicates {

	public static void main(String[] args) {
		
		String s = "chiripi reddy seshu reddy chiripi reddy sirisha reddy";
		
		String[] s1 = s.split(" ");
		int count = 1;
		Map<String , Integer> map = new HashMap<>();
		
		for (int i = 0; i < s1.length; i++) {
			
			if(map.containsKey(s1[i])) {
				
				count = map.get(s1[i]);
				
				map.put(s1[i], count+1);
				
			}else {
				
				map.put(s1[i], count);
				
			}
			
		}
		
		Set s3 = map.keySet();
		
		Iterator<String> it = s3.iterator();
		
		while(it.hasNext()) {
			
			String str = it.next();
			
			System.out.println(str + " : " + map.get(str));
			
		}
		

	}

}
