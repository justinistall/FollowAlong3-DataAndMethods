package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7151s
//        rewatch 1:59:10–2:03:35 for the String methods, 2:07:30–2:11:35 for wrapper classes
// Guide: GUIDE.md in this folder, steps 2–15
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.




public class Stretch {

    public static void main(String[] args) {

        // STRETCH A - STRING METHODS

        // Create a String variable
        String name = "Justin Halstead";

        // Print the name in uppercase
        System.out.println(name.toUpperCase());

        // Print the name in lowercase
        System.out.println(name.toLowerCase());

        // Print the first letter of the name
        System.out.println(name.charAt(0));

        // Print how many characters are in the name
        System.out.println(name.length());

        // Replace Justin with John
        System.out.println(name.replace("Justin", "John"));

        // Print the first name only
        System.out.println(name.substring(0, 6));

        // STRETCH B - WRAPPER CLASSES

        // Convert a String to an int
        int age = Integer.parseInt("20");

        // Convert a String to a double
        double price = Double.parseDouble("15.50");

        // Create an Integer wrapper object
        Integer number = 100;

        // Convert the Integer into a regular int
        int regularNumber = number;

        // Print the age
        System.out.println(age);

        // Print the price
        System.out.println(price);

        // Print the regular number
        System.out.println(regularNumber);

        // Convert the age into a String
        String ageText = Integer.toString(age);

        // Print the converted String
        System.out.println(ageText);
    }
}
