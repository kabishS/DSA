public class FindSecondMaxValue {
    public static void main(String[] args) {
        int arr[] = {23,78,34,67,48,17};
        int a = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if(a <= arr[i]){
                a = arr[i];
            }
        }
    
    int b=Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
          if (a>arr[i]) {
            if(b<=arr[i]){
                b = arr[i];
            }
        }
    }
    System.out.println(b);
}
}