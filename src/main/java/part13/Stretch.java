package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        rewatch 2:28:40–2:35:20 for parameters, 2:35:25–2:39:30 for return types
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it — and your own methods
// underneath it — is part of the stretch.




public class Stretch {

    // Start the program
    public static void main(String[] args) {

        // STRETCH A - METHODS WITH PARAMETERS

        // Call the greet method
        greet("Justin");

        // Call the greet method with another name
        greet("John");

        // Call the showAge method
        showAge(20);

        // Call the addNumbers method
        addNumbers(5, 10);

        // STRETCH B - METHODS WITH RETURN TYPES

        // Call the multiply method and save the answer
        int answer = multiply(4, 5);

        // Print the answer
        System.out.println(answer);

        // Call the square method
        int result = square(6);

        // Print the result
        System.out.println(result);

        // Call the fullName method
        String name = fullName("Justin", "Halstead");

        // Print the full name
        System.out.println(name);
    }

    // STRETCH A METHODS

    // Make a method that greets someone
    public static void greet(String name) {

        // Print the greeting
        System.out.println("Hello " + name);
    }

    // Make a method that shows someone's age
    public static void showAge(int age) {

        // Print the age
        System.out.println("Age: " + age);
    }

    // Make a method that adds two numbers
    public static void addNumbers(int a, int b) {

        // Print the sum
        System.out.println(a + b);
    }

    // STRETCH B METHODS

    // Make a method that multiplies two numbers
    public static int multiply(int a, int b) {

        // Return the product
        return a * b;
    }

    // Make a method that squares a number
    public static int square(int number) {

        // Return the number multiplied by itself
        return number * number;
    }

    // Make a method that combines two names
    public static String fullName(String first, String last) {

        // Return the full name
        return first + " " + last;
    }
}
