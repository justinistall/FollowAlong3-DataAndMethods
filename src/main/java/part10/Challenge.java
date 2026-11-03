package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6233s
//        rewatch 1:43:53 (getting one element) and 1:48:37 (looping through an array)
// Guide: GUIDE.md in this folder, steps 2 and 6
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part10/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.






public class Challenge {

    // Check if the first or last number matches target
    public static boolean endsWith(int[] nums, int target) {

        // Check the first and last number
        return nums[0] == target || nums[nums.length - 1] == target;
    }

    // Add all the numbers in the array
    public static int total(int[] nums) {

        // Start the total at zero
        int sum = 0;

        // Go through every number in the array
        for (int i = 0; i < nums.length; i++) {

            // Add each number to the total
            sum += nums[i];
        }

        // Return the final total
        return sum;
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Test endsWith
        System.out.println(endsWith(new int[]{7, 2, 3}, 7));
        System.out.println(endsWith(new int[]{1, 2, 9}, 9));
        System.out.println(endsWith(new int[]{1, 5, 3}, 5));

        // Test total
        System.out.println(total(new int[]{1, 2, 3}));
        System.out.println(total(new int[]{10}));
        System.out.println(total(new int[]{}));
    }
}
