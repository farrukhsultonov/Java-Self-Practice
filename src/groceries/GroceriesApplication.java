package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceriesApplication {

    public static void groceryApplication() {
        System.out.println("Would you like to create a grocery list? (y/n)");
        if (Input.yesNo()) {
            createGroceryList();
        }
    }

    public static void createGroceryList() {
        HashMap<Integer, Item> groceryList = new HashMap<>();
        int counter = 1;
        String finalAnswer;
        do {
            System.out.printf("***Item %d***\n", counter);
            System.out.println("Please enter the name of your item:");
            String itemName = Input.getString();
            System.out.println("Please enter the quantity of your item:");
            int itemQuantity = Input.getInt();
            // added get String to burn the \n line not consumed by get Int
            Input.getString();
            String itemCategory;
            do {
                System.out.println("Which category does your item fall into: Produce, Meat, Cooking, Frozen, or Dairy?");
                itemCategory = Input.getString();
                if (itemCategory.equalsIgnoreCase("Produce") | itemCategory.equalsIgnoreCase("Meat") | itemCategory.equalsIgnoreCase("Cooking") | itemCategory.equalsIgnoreCase("Frozen") | itemCategory.equalsIgnoreCase("Dairy")) {
                    break;
                } else {
                    System.out.println("Category not recognized, please enter another category.");
                    itemCategory = "again";
                }
            } while (itemCategory.equals("again"));
            groceryList.put(counter, new Item(itemName, itemQuantity, itemCategory));
            System.out.printf("\n%dx %s added!\n", itemQuantity, itemName);
            counter++;
            System.out.println("Current Grocery List: ");
            for (int i : groceryList.keySet()) {
                System.out.printf("Item %d: " + groceryList.get(i).getQuantity() + "x " + groceryList.get(i).getName() + " (" + groceryList.get(i).getCategory() + ")\n", i);
            }
            System.out.println("If you would like to add another item, enter: (y)");
            System.out.println("To finalize list, enter: (done)");
            finalAnswer = Input.getString();
            if (finalAnswer.equals("done")) {
                break;
            }
        } while (finalAnswer.equals("y"));
        System.out.println("Finalized Grocery List: ");
        ArrayList<Item> produce = new ArrayList<>();
        ArrayList<Item> meat = new ArrayList<>();
        ArrayList<Item> cooking = new ArrayList<>();
        ArrayList<Item> frozen = new ArrayList<>();
        ArrayList<Item> dairy = new ArrayList<>();
        for (int i : groceryList.keySet()) {
            if (groceryList.get(i).category.equalsIgnoreCase("produce")){
                produce.add(groceryList.get(i));
            } else if (groceryList.get(i).category.equalsIgnoreCase("meat")) {
                meat.add(groceryList.get(i));
            } else if (groceryList.get(i).category.equalsIgnoreCase("cooking")) {
                cooking.add(groceryList.get(i));
            } else if (groceryList.get(i).category.equalsIgnoreCase("frozen")) {
                frozen.add(groceryList.get(i));
            } else if (groceryList.get(i).category.equalsIgnoreCase("dairy")) {
                dairy.add(groceryList.get(i));
            }
        }
        System.out.println("---Produce---");
        for (Item i : produce){
            System.out.println(i.getQuantity() + "x " + i.getName());
        }
        System.out.println("---Meat---");
        for (Item i : meat){
            System.out.println(i.getQuantity() + "x " + i.getName());
        }
        System.out.println("---Cooking---");
        for (Item i : cooking){
            System.out.println(i.getQuantity() + "x " + i.getName());
        }
        System.out.println("---Frozen---");
        for (Item i : frozen){
            System.out.println(i.getQuantity() + "x " + i.getName());
        }
        System.out.println("---Dairy---");
        for (Item i : dairy){
            System.out.println(i.getQuantity() + "x " + i.getName());
        }
        System.out.println("Happy Shopping!");
    }


    public static void main(String[] args) {
        groceryApplication();
    }
}