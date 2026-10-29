package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        starts at about 1:58:15 — stop at about 2:03:35, when he says "those are a few of the more useful String methods"
// Guide: GUIDE.md in this folder, steps 1–10
//
// Part 11 — String methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StringMethods.
//    Leave the "package part11;" line and the "public class StringMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class StringMethods {

    // Start the program
    public static void main(String[] args) {

        // Make a String variable
        String name = "Justin Halstead";

        // Print how many characters are in the String
        System.out.println(name.length());

        // Print the first character
        System.out.println(name.charAt(0));

        // Find the position of the letter H
        System.out.println(name.indexOf("H"));

        // Find the last position of the letter a
        System.out.println(name.lastIndexOf("a"));

        // Make all the letters uppercase
        System.out.println(name.toUpperCase());

        // Make all the letters lowercase
        System.out.println(name.toLowerCase());

        // Remove extra spaces from a String
        String text = "  Hello World  ";
        System.out.println(text.trim());

        // Replace a letter with another letter
        System.out.println(name.replace("a", "o"));

        // Check if the String is empty
        System.out.println(name.isEmpty());

        // Check if the String contains Justin
        System.out.println(name.contains("Justin"));

        // Check if the String starts with Justin
        System.out.println(name.startsWith("Justin"));

        // Check if the String ends with Halstead
        System.out.println(name.endsWith("Halstead"));

        // Get the first six characters
        System.out.println(name.substring(0, 6));

        // Check if two Strings are the same
        System.out.println(name.equals("Justin Halstead"));

        // Compare two Strings without checking capitals
        System.out.println(name.equalsIgnoreCase("justin halstead"));
    }
}

