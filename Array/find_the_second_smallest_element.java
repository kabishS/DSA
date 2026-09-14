public class find_the_second_smallest_element {
    public static void main(String[] args) {
        int arr[] = {5,2,9,1,7};

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            // Find lowest and second lowest
            if (num < lowest) {
                secondLowest = lowest;
                lowest = num;
            } else if (num < secondLowest && num != lowest) {
                secondLowest = num;
            }
            
            // Find highest and second highest
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        
        System.out.println("Second Lowest: " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);
        
    }
}
