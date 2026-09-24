class find_the_maximum_subarray_sum {
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            int temp = 0;
            
            for(int j=i; j<arr.length; j++){
                temp += arr[j];
                ans = Math.max(temp,ans);
            }
        }
        System.out.println(ans);
    }
}
