package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s
//        starts at about 2:16:50 — stop at about 2:23:45, when he says "that's how two-dimensional ArrayLists work"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 12 — 2D ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrayLists.
//    Leave the "package part12;" line and the "public class TwoDArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




import java.util.ArrayList;

public class TwoDArrayLists {

    // Start the program
    public static void main(String[] args) {

        // Create a list for bakery foods
        ArrayList<String> bakeryList = new ArrayList<>();

        // Add items to the bakery list
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        // Create a list for produce
        ArrayList<String> produceList = new ArrayList<>();

        // Add items to the produce list
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        // Create a list for drinks
        ArrayList<String> drinksList = new ArrayList<>();

        // Add items to the drinks list
        drinksList.add("soda");
        drinksList.add("coffee");

        // Create a 2D ArrayList to hold all the lists
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        // Add each list to the grocery list
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        // Print the entire grocery list
        System.out.println(groceryList);

        // Print the first item from the first list
        System.out.println(groceryList.get(0).get(0));

        // Print the second item from the second list
        System.out.println(groceryList.get(1).get(1));

        // Go through each list
        for (int i = 0; i < groceryList.size(); i++) {

            // Go through each item in that list
            for (int j = 0; j < groceryList.get(i).size(); j++) {

                // Print the current item
                System.out.println(groceryList.get(i).get(j));
            }
        }
    }
}
