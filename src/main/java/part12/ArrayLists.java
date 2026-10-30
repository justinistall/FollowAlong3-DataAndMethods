package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.






import java.util.ArrayList;

public class ArrayLists {

    // Start the program
    public static void main(String[] args) {

        // Create an ArrayList to hold food names
        ArrayList<String> food = new ArrayList<String>();

        // Add food to the ArrayList
        food.add("pizza");

        // Add another food
        food.add("hamburger");

        // Add another food
        food.add("hotdog");

        // Print the first food
        System.out.println(food.get(0));

        // Change the first food to sushi
        food.set(0, "sushi");

        // Remove the second food
        food.remove(1);

        // Print how many foods are in the list
        System.out.println(food.size());

        // Go through each food in the ArrayList
        for (int i = 0; i < food.size(); i++) {

            // Print each food
            System.out.println(food.get(i));
        }

        // Clear all foods from the ArrayList
        food.clear();

        // Print the empty ArrayList
        System.out.println(food);
    }
}
