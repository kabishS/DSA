public class find_the_maximum_minimum_value {
    public static void main(String[] args) {
        int arr[] = {5,2,9,1,7};
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(min >= arr[i]){
                min = arr[i];
            }
        }

        System.out.println("max "+ max);
        System.out.println("min " + min);
    }
}
