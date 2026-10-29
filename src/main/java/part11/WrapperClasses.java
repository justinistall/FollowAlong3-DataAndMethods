package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s
//        starts at about 2:04:27 — stop at about 2:11:35, when he says "that's the basics of wrapper classes"
// Guide: GUIDE.md in this folder, steps 11–15
//
// Part 11 — wrapper classes
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WrapperClasses.
//    Leave the "package part11;" line and the "public class WrapperClasses" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class WrapperClasses {

    // Start the program
    public static void main(String[] args) {

        // Make an Integer wrapper
        Integer number = 100;

        // Make a Double wrapper
        Double decimal = 3.14;

        // Make a Character wrapper
        Character letter = 'A';

        // Make a Boolean wrapper
        Boolean isStudent = true;

        // Print the wrapper values
        System.out.println(number);
        System.out.println(decimal);
        System.out.println(letter);
        System.out.println(isStudent);

        // Automatically turn an int into an Integer
        Integer boxedNumber = 50;

        // Automatically turn an Integer into an int
        int unboxedNumber = boxedNumber;

        // Print the unboxed number
        System.out.println(unboxedNumber);

        // Convert a String into an integer
        int age = Integer.parseInt("20");

        // Convert a String into a double
        double price = Double.parseDouble("19.99");

        // Print the converted values
        System.out.println(age);
        System.out.println(price);

        // Convert an integer into a String
        String text = Integer.toString(123);

        // Print the String
        System.out.println(text);
    }
}
