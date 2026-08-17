import java.util.*;
public class Duplicate{
	public static void main(String[] args) {
		String str = "apple";
		TreeSet<Character> h = new TreeSet<>();
		for(int i=0; i<str.length(); i++){
		    char c = str.charAt(i);
		    if(!h.contains(c)){
		        h.add(c);
		    }
		    else{
		        System.out.println("duplicate "+c);
		    }
		}
		System.out.println(h);
	}
}
//duplicate p
//[a, e, l, p]