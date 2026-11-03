package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        starts at about 2:40:18 — stop at about 2:45:29, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 14, video 1 — overloaded methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedMethods.
//    Leave the "package part14;" line and the "public class OverloadedMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class OverloadedMethods {

    // Start the program
    public static void main(String[] args) {

        // Add two whole numbers
        int result1 = add(5, 10);

        // Print the first answer
        System.out.println(result1);

        // Add three whole numbers
        int result2 = add(5, 10, 15);

        // Print the second answer
        System.out.println(result2);

        // Add two decimal numbers
        double result3 = add(2.5, 3.5);

        // Print the third answer
        System.out.println(result3);

        // Add three decimal numbers
        double result4 = add(2.5, 3.5, 4.5);

        // Print the fourth answer
        System.out.println(result4);
    }

    // Method that adds two integers
    public static int add(int a, int b) {

        // Return the sum of two numbers
        return a + b;
    }

    // Method that adds three integers
    public static int add(int a, int b, int c) {

        // Return the sum of three numbers
        return a + b + c;
    }

    // Method that adds two doubles
    public static double add(double a, double b) {

        // Return the sum of two decimals
        return a + b;
    }

    // Method that adds three doubles
    public static double add(double a, double b, double c) {

        // Return the sum of three decimals
        return a + b + c;
    }
}
