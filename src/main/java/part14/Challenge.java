package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        rewatch "overloaded methods" (about 2:40:18) and "printf" (about 2:45:54)
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the THREE methods below. (tag has two versions. That is
// this part's topic: overloading.) Then run ChallengeTest until every test is green.
// Change only the lines marked YOUR CODE.



public class Challenge {

    // Wrap text inside an HTML tag
    public static String tag(String name, String text) {
        return "<" + name + ">" + text + "</" + name + ">";
    }

    // Use the bold HTML tag
    public static String tag(String text) {
        return tag("b", text);
    }

    // Format a number as money
    public static String money(double amount) {
        return String.format(java.util.Locale.US, "$%.2f", amount);
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Test tag with two inputs
        System.out.println(tag("b", "hi"));
        System.out.println(tag("i", "Yay"));
        System.out.println(tag("h1", "Menu"));

        // Test tag with one input
        System.out.println(tag("hi"));
        System.out.println(tag("Wow"));

        // Test money
        System.out.println(money(3.5));
        System.out.println(money(0));
        System.out.println(money(19.999));
    }
}
