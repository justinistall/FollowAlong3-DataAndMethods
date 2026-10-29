package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6233s
//        rewatch 1:43:53 (arrays), 1:48:37 (looping through an array), 1:53:36 (2D loops)
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.




public class Stretch {

    public static void main(String[] args) {

        // STRETCH A - ARRAYS

        // Make an array with five numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print all numbers using a loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // STRETCH B - 2D ARRAYS

        // Make a 2D array with three rows
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Loop through each row
        for (int row = 0; row < grid.length; row++) {

            // Loop through each number in the row
            for (int col = 0; col < grid[row].length; col++) {

                // Print each number
                System.out.print(grid[row][col] + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}

