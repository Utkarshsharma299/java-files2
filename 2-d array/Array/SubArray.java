public class SubarrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printSubarrays(arr);
    }

    public static void printSubarrays(int[] arr) {
        int n = arr.length;

        // 1. Pick starting point
        for (int i = 0; i < n; i++) {
            
            // 2. Pick ending point
            for (int j = i; j < n; j++) {
                
                // 3. Print elements between start (i) and end (j)
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + (k < j ? ", " : ""));
                }
                System.out.println("]");
            }
        }
    }
}