public class find_the_second_largest_element {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 4, 45, 99 };
        int first = 0;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("The second largest element is " + second);
    }
}
