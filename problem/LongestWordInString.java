public class LongestWordInString {
    	public static void main(String[] args) {
	    String str = "java is program heloo";
	    String arr[] = str.split(" ");
	    String a = "";
	    for(int i=0; i<arr.length; i++){
	        if (arr[i].length()>a.length()){
	            a = arr[i];
	        }
	    }
	    System.out.print(a);
	}
}
// program