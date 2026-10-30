package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s
//        starts at about 2:23:57 — stop at about 2:27:20, when he says "that is everything you need to know to get started with the for-each loop"
// Guide: GUIDE.md in this folder, steps 11–13
//
// Part 12 — the for-each loop
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForEachLoop.
//    Leave the "package part12;" line and the "public class ForEachLoop" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




import java.util.ArrayList;

public class ForEachLoop {

    // Start the program
    public static void main(String[] args) {

        // Create an array with different animals
        String[] animals = {"cat", "dog", "bird"};

        // Go through every animal in the array
        for (String animal : animals) {

            // Print each animal
            System.out.println(animal);
        }

        // Create an ArrayList to store food
        ArrayList<String> foods = new ArrayList<String>();

        // Add pizza to the list
        foods.add("pizza");

        // Add hamburger to the list
        foods.add("hamburger");

        // Add hotdog to the list
        foods.add("hotdog");

        // Go through each food in the ArrayList
        for (String food : foods) {

            // Print each food
            System.out.println(food);
        }
    }
}

