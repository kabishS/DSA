public class main {
    public static void main(String[] args) {
        int arr[] = {4,7,4,9,2,1};
        int l = arr[0];
        for(int i=0;i<arr.length; i++){
            if(l<=arr[i]){
                l = arr[i];
            }
        }
        System.out.println("largest number of array is : " + l);
    }
}