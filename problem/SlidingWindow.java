public class SlidingWindow
{
	public static void main(String[] args) {
		int arr[] = {2,9,31,-4,21,7};
		int k = 3;
		int wsum = 0;
		int msum = Integer.MIN_VALUE;
		for(int i=0; i<k; i++){
		    wsum += arr[i];  //42
		}
		for(int i=k; i<arr.length; i++){
		   wsum = wsum +arr[i] - arr[i-k];
		   msum = Math.max(msum,wsum);
		}
		System.out.print("Subarray is:"+msum);
	}
}
//48