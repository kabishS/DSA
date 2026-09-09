public class left_rotate_an_array_by_one_position{
    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 2, 8, 1}; 
        int tarr[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            tarr[i - 1] = arr[i];
        }
        tarr[arr.length - 1] = arr[0];
        for (int ans : tarr) {
            System.out.print(ans);
        }
    }
}
