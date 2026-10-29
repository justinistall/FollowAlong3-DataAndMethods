package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s
//        starts at 1:50:51 — stop at about 1:57:41, at "so that is the basics of 2D arrays"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 10 — 2D arrays (an array of arrays: rows and columns)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrays.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class TwoDArrays {

    // Start the program
    public static void main(String[] args) {

        // Create a 2D array with 3 rows and 3 columns
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };

        // Print the first car in the first row
        System.out.println(cars[0][0]);

        // Print the second car in the second row
        System.out.println(cars[1][1]);

        // Change the first car to a Honda
        cars[0][0] = "Honda";

        // Go through each row in the array
        for (int i = 0; i < cars.length; i++) {

            // Go through each column in that row
            for (int j = 0; j < cars[i].length; j++) {

                // Print the car with a space
                System.out.print(cars[i][j] + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
