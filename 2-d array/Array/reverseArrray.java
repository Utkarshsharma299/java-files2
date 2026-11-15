import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        reverse(numbers);
        
        // Output: [50, 40, 30, 20, 10]
        System.out.println(Arrays.toString(numbers));
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers closer to the center
            start++;
            end--;
        }
    }
}