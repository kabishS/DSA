import java.util.*;
public class FindingRepeatWord{
    public static void main(String args[]){
        HashSet<String> h = new HashSet<>();   
        String str = "apple mango apple";
        // String arr[] = {"apple", "mango", "apple"};
        String arr[] = str.split(" ");
        for(int i=0; i<arr.length; i++){
            String a = arr[i];
            if (!h.contains(arr[i])) {
                h.add(a);
            }
            else{
                System.out.println("repeat:- " + a);
            }
        }
        System.out.println(h);
    }
}
//repeat:- apple
//[apple, mango]
