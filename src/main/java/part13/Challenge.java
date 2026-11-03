package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9324s
//        rewatch 2:35:25–2:39:30 for return types
// Guide: GUIDE.md in this folder, steps 8–11
//
// SECTION D — Challenge. Two methods. The README explains each one.
// A test in src/test/java/part13/ChallengeTest.java checks your answers.
// Change ONLY the lines marked YOUR CODE. Do not change the test file.




public class Challenge {

    // Check if a number is positive, negative, or zero
    public static String sign(int n) {

        if (n > 0) {
            return "positive";
        } else if (n < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    // Find which number is closer to 10
    public static int closerTo10(int a, int b) {

        // Find the distance of each number from 10
        int distanceA = Math.abs(a - 10);
        int distanceB = Math.abs(b - 10);

        // Return the closer number or zero if tied
        if (distanceA < distanceB) {
            return a;
        } else if (distanceB < distanceA) {
            return b;
        } else {
            return 0;
        }
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Test sign
        System.out.println(sign(5));
        System.out.println(sign(-3));
        System.out.println(sign(0));

        // Test closerTo10
        System.out.println(closerTo10(8, 13));
        System.out.println(closerTo10(8, 12));
        System.out.println(closerTo10(15, 9));
    }
}
