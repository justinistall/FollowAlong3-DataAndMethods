package part12;

import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s
//        rewatch 2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder, steps 11–13
//
// SECTION D — Challenge. Two methods. The README explains each one.
// A test in src/test/java/part12/ChallengeTest.java checks your answers.
// Change ONLY the lines marked YOUR CODE. Do not change the test file.




import java.util.ArrayList;
import java.util.Arrays;

public class Challenge {

    // Count how many even numbers are in the list
    public static int countEvens(ArrayList<Integer> nums) {

        // Start counting at zero
        int count = 0;

        // Go through each number
        for (int num : nums) {

            // Check if the number is even
            if (num % 2 == 0) {
                count++;
            }
        }

        // Return the number of even numbers
        return count;
    }

    // Find the difference between biggest and smallest
    public static int spread(ArrayList<Integer> nums) {

        // Start with the first number
        int biggest = nums.get(0);
        int smallest = nums.get(0);

        // Go through each number
        for (int num : nums) {

            // Find the biggest number
            if (num > biggest) {
                biggest = num;
            }

            // Find the smallest number
            if (num < smallest) {
                smallest = num;
            }
        }

        // Return the difference
        return biggest - smallest;
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Test countEvens
        System.out.println(countEvens(
                new ArrayList<>(Arrays.asList(2, 1, 2, 3, 4))));

        System.out.println(countEvens(
                new ArrayList<>(Arrays.asList(1, 3, 5))));

        // Test spread
        System.out.println(spread(
                new ArrayList<>(Arrays.asList(3, 9, 2, 5))));

        System.out.println(spread(
                new ArrayList<>(Arrays.asList(42))));
    }
}
