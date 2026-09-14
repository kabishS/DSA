public class find_the_second_smallest_element {
    public static void main(String[] args) {
        int arr[] = {5,2,9,1,7};
        int ss = arr[0];

        for(int i=0; i<arr.length; i++){
            if(ss >= arr[i]){
                ss = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(ss <= arr[i]){
                ss = arr[i];
                System.out.println(ss);
            }
        } 
    }
}
