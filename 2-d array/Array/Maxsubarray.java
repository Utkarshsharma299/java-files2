public class MaxSubarrayBruteForce {
    public static int maxSubarraySumBruteForce(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        // 1. Starting point
        for (int i = 0; i < n; i++) {
            // 2. Ending point
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                
                // 3. Calculate sum of current subarray
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                
                // Update max sum if current subarray sum is larger
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        System.out.println("Max Subarray Sum (Brute Force): " + maxSubarraySumBruteForce(arr));
    }
}