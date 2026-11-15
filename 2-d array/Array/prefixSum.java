public class MaxSubarrayPrefixSum {
    public static int maxSubarraySumPrefix(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        
        // 1. Create and calculate the prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // 2. Find max sum using two loops
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // If i == 0, the sum is simply prefix[j]
                int currentSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        System.out.println("Max Subarray Sum (Prefix Sum): " + maxSubarraySumPrefix(arr));
    }
}
