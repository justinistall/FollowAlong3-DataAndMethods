package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:00–2:16:20 for ArrayList, 2:16:50–2:23:45 for 2D ArrayList,
//        2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet, and no import. Typing both is part of the stretch.




import java.util.ArrayList;

public class Stretch {

    public static void main(String[] args) {

        // STRETCH A - ARRAYLIST

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Justin");
        names.add("John");
        names.add("Mike");

        // Print the first name
        System.out.println(names.get(0));

        // Change the second name
        names.set(1, "James");

        // Remove the last name
        names.remove(2);

        // Print how many names are left
        System.out.println(names.size());

        // Print every name using a for-each loop
        for (String name : names) {
            System.out.println(name);
        }

        // STRETCH B - 2D ARRAYLIST

        // Create a 2D ArrayList
        ArrayList<ArrayList<String>> foods = new ArrayList<>();

        // Create a list of fruits
        ArrayList<String> fruits = new ArrayList<>();

        // Add fruits
        fruits.add("Apple");
        fruits.add("Banana");

        // Create a list of drinks
        ArrayList<String> drinks = new ArrayList<>();

        // Add drinks
        drinks.add("Water");
        drinks.add("Juice");

        // Add both lists to the 2D ArrayList
        foods.add(fruits);
        foods.add(drinks);

        // Go through each list
        for (ArrayList<String> list : foods) {

            // Go through each item
            for (String item : list) {

                // Print each item
                System.out.println(item);
            }
        }
    }
}
