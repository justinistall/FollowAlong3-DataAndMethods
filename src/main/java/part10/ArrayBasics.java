package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        starts at 1:43:42 — stop at about 1:49:45, at "so that's what an array is"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 10 — arrays (many values in one variable)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayBasics.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class ArrayBasics {

    public static void main(String[] args) {

        // Make an array that holds five numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the first number
        System.out.println(numbers[0]);

        // Print the second number
        System.out.println(numbers[1]);

        // Print the third number
        System.out.println(numbers[2]);

        // Make an array with three names
        String[] names = {"Justin", "John", "Mike"};

        // Print the first name
        System.out.println(names[0]);

        // Print the second name
        System.out.println(names[1]);

        // Change the first number to 100
        numbers[0] = 100;

        // Print the new first number
        System.out.println(numbers[0]);

        // Print how many numbers are in the array
        System.out.println(numbers.length);

        // Go through every number in the array
        for (int i = 0; i < numbers.length; i++) {

            // Print the number at this position
            System.out.println(numbers[i]);
        }
    }
}
