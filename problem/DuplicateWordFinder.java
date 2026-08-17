import java.util.*;
public class DuplicateWordFinder {
    public static void main(String args[]){
        String str = "apple mango apple";
        String arr[] = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
           String c = arr[i];

           if(map.containsKey(c)){
            map.put(c, map.get(c)+1);
           }
           else{
            map.put(c,1);
           }

        }
        for(Map.Entry<String, Integer>m:map.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey()+":"+m.getValue());
			}
		}

    }
}