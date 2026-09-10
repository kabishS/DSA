public class left_rotate_an_array_by_k_positions {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int tarr[] = new int[arr.length];
        int k = 2;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            tarr[i] = arr[(i + k) % n];
        }

        for (int ans : tarr) {
            System.out.print(ans);
        }
    }
}
