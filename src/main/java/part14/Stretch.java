package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        rewatch 2:40:18–2:45:29 (overloading) or 2:45:54–2:56:50 (printf)
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Your extra methods (twice, area) go INSIDE this class, but OUTSIDE main.




public class Stretch {

    // Main method to run the program
    public static void main(String[] args) {

        // STRETCH A - OVERLOADED METHODS

        // Call twice with an integer
        System.out.println(twice(5));

        // Call twice with a decimal
        System.out.println(twice(3.5));

        // Call area with two numbers
        System.out.println(area(4, 6));

        // Call area with one number
        System.out.println(area(5));

        // STRETCH B - PRINTF

        // Create a name variable
        String name = "Justin";

        // Create an age variable
        int age = 20;

        // Create a price variable
        double price = 19.99;

        // Print the name
        System.out.printf("Name: %s%n", name);

        // Print the age
        System.out.printf("Age: %d%n", age);

        // Print the price with two decimal places
        System.out.printf("Price: $%.2f%n", price);

        // Print a number with leading zeros
        System.out.printf("Number: %05d%n", 42);

        // Print a decimal with one decimal place
        System.out.printf("Decimal: %.1f%n", 12.567);
    }

    // Method that doubles an integer
    public static int twice(int number) {

        // Return the number multiplied by two
        return number * 2;
    }

    // Overloaded method that doubles a decimal
    public static double twice(double number) {

        // Return the decimal multiplied by two
        return number * 2;
    }

    // Method that finds the area of a rectangle
    public static int area(int length, int width) {

        // Multiply the length and width
        return length * width;
    }

    // Overloaded method that finds the area of a square
    public static int area(int side) {

        // Multiply the side by itself
        return side * side;
    }
}
