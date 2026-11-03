package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class Methods {

    // Start the program
    public static void main(String[] args) {

        // Call the hello method
        hello();

        // Call the hello method again
        hello();

        // Call the greet method with a name
        greet("Justin");

        // Call the greet method with another name
        greet("John");

        // Call the add method and save the answer
        int result = add(10, 20);

        // Print the answer
        System.out.println(result);

        // Call the multiply method
        int product = multiply(5, 4);

        // Print the product
        System.out.println(product);

        // Call the fullName method
        String name = fullName("Justin", "Halstead");

        // Print the full name
        System.out.println(name);
    }

    // Make a method that prints hello
    public static void hello() {

        // Print hello
        System.out.println("Hello!");
    }

    // Make a method that takes a name
    public static void greet(String name) {

        // Print a greeting with the name
        System.out.println("Hello " + name);
    }

    // Make a method that adds two numbers
    public static int add(int a, int b) {

        // Add the numbers and return the answer
        return a + b;
    }

    // Make a method that multiplies two numbers
    public static int multiply(int a, int b) {

        // Multiply the numbers and return the answer
        return a * b;
    }

    // Make a method that combines first and last names
    public static String fullName(String first, String last) {

        // Return the full name with a space
        return first + " " + last;
    }
}
