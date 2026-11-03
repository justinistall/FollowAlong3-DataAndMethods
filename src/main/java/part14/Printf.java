package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9954s
//        starts at about 2:45:54 — stop at about 2:56:50, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 14, video 2 — the printf method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Printf.
//    Leave the "package part14;" line and the "public class Printf" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class Printf {

    // Start the program
    public static void main(String[] args) {

        // Make a String variable
        String name = "Justin";

        // Make an integer variable
        int age = 20;

        // Make a double variable
        double price = 19.99;

        // Make a boolean variable
        boolean isStudent = true;

        // Make a character variable
        char grade = 'A';

        // Print a String using %s
        System.out.printf("Hello %s%n", name);

        // Print an integer using %d
        System.out.printf("Age: %d%n", age);

        // Print a decimal using %f
        System.out.printf("Price: %f%n", price);

        // Print a boolean using %b
        System.out.printf("Student: %b%n", isStudent);

        // Print a character using %c
        System.out.printf("Grade: %c%n", grade);

        // Print a decimal with two digits
        System.out.printf("Price: %.2f%n", price);

        // Print a number with one decimal place
        System.out.printf("Number: %.1f%n", 12.567);

        // Print a number with three decimal places
        System.out.printf("Number: %.3f%n", 12.567);

        // Print a number in a field that is 10 spaces wide
        System.out.printf("Number: %10d%n", 123);

        // Move the number to the left
        System.out.printf("Number: %-10d%n", 123);

        // Add zeros before a number
        System.out.printf("Number: %010d%n", 123);

        // Show a plus sign for a positive number
        System.out.printf("Number: %+d%n", 100);

        // Put commas in a large number
        System.out.printf("Number: %,d%n", 1000000);

        // Print a money amount with two decimal places
        System.out.printf("Total: $%.2f%n", 25.5);
    }
}
