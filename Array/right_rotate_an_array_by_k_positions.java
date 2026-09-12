public class right_rotate_an_array_by_k_positions{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int arr[] = {1,2,3,4,5,6};
		int k=3;
		int tarr[] = new int[arr.length];
		int a=0;
		
		for(int i=arr.length-k; i<arr.length; i++){
		    tarr[a] = arr[i];
		    a++;
		}
		
		for(int i=0; i<arr.length-k; i++){
		    tarr[a] = arr[i];
		    a++;
		}
		
		for (int ans : tarr) {
            System.out.print(ans);
        }


	}
}
