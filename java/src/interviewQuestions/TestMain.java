
import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(minIncrementForUnique1(nums));
    }

    public static int solution(int[] nums) {
        int totalMoves = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int[] newArray = {};
                if (currentValue == nums[j] && i != j) {
                    newArray[j] = currentValue;
                    currentValue++;
                    totalMoves++;
                }
                // else {
                //     newArray[j] = currentValue;
                // }
                System.out.println(newArray);
            }
        }

        return totalMoves;
    }

    public static int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Sort the array
        Arrays.sort(nums);

        int moves = 0;

        // Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            // If the current number is not greater than the previous number
            if (nums[i] <= nums[i - 1]) {
                // Calculate the needed increment to make it unique
                int increment = nums[i - 1] + 1 - nums[i];
                // Add this increment to the current number
                nums[i] += increment;
                // Add the increment to the total moves
                moves += increment;
            }
        }

        return moves;
    }

    public static int minIncrementForUnique1(int[] nums) {
        // Manually sort the array using Bubble Sort
        bubbleSort(nums);

        // Variable to keep track of the moves needed
        int moves = 0;

        // Iterate through the array and adjust values to ensure uniqueness
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] - nums[i] + 1;
                nums[i] += increment;
                moves += increment;
            }
        }

        return moves;
    }

    private static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    

}
