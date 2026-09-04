public class check_if_an_array_is_sorted{
    
    static boolean isSorted(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 1,10, 12, 14};
        System.out.println(isSorted(arr));
    }
}
