public class PrintPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printAllPairs(arr);
    }

    public static void printAllPairs(int[] arr) {
        int n = arr.length;
        int totalPairs = 0;

        // Outer loop picks the first element
        for (int i = 0; i < n; i++) {
            
            // Inner loop picks the second element (starts after the first)
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                totalPairs++;
            }
            System.out.println(); // New line for readability after each starting element
        }
        
        System.out.println("Total pairs printed: " + totalPairs);
    }
}