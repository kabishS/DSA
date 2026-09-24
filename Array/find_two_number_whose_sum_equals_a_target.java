import java.util.Arrays;

class find_two_number_whose_sum_equals_a_target{
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int t = 9;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                int c = arr[i] + arr[j];
                if(t == c){
                    System.out.println("Index: " + i + " and " + j);
                }
            }
        }
    }
}
