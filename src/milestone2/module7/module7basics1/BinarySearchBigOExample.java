package milestone2.module7.module7basics1;

// O(log n)
public class BinarySearchBigOExample {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                System.out.println("Found");
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;   // discard left half
            } else {
                right = mid - 1;  // discard right half
            }
        }
    }
}
