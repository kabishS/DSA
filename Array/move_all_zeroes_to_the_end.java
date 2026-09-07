class move_all_zeroes_to_the_end{
    public static void main(String args[]) {

        int nums[] = {0, 1, 0, 3, 12};
        int[] arr = new int[nums.length];
        int[] brr = new int[nums.length];
        int[] crr = new int[nums.length];

        int zeroIndex = 0;
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[zeroIndex++] = nums[i];
            } else {
                brr[nonZeroIndex++] = nums[i];
            }
        }

        int k = 0;

        for (int i = 0; i < nonZeroIndex; i++) {
            crr[k++] = brr[i];
        }

        for (int i = 0; i < zeroIndex; i++) {
            crr[k++] = arr[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(crr[i] + " ");
        }
    }
}
