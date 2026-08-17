import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount{
	public static void main(String[] args) {	
		String s = "apple";	
		HashMap<Character,Integer> map = new HashMap<>();	
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer>m:map.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey()+" is : "+m.getValue() + " time");
			}
		}
		//System.out.println(map);
		
	}


}
//p is : 2 time