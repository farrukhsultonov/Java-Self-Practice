import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {

//    Java Collections
//
//### What is a Data Structure?
//
//- A way of storing and organizing data for effective access and modification.
//
//### What are Collections?
//
//- A Collection is a data structure that can be used to store and group objects.
//- Java Collections are not part of the native language, but are included in the Java standard library.
//- Collection is actually an interface that is extended by a few sub-interfaces like List, Set and Queue.
//- Today we will be covering a specific subtype of List: ArrayList
//
//[Java Docs - Collection interface](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)
//
//### What are Maps?
//
//- Maps are another data structure provided in the Java standard library.
//- It is not a subtype of Collection, therefore it behaves differently.
//- Maps are intended to store key-value pairs, similar to Objects in JavaScript.
//- Today we will be covering a specific subtype of Map: HashMap
//
//** Both of these libraries can be imported into a Class for use **
//
//### ArrayList
//
//- The ArrayList type acts like a wrapper around a native Java array.
//- The methods available on an ArrayList allow us to easily manipulate the ArrayList when adding or accessing elements.
//- Unlike Arrays in JavaScript however, ArrayLists can only hold Objects and they must be of the same type.
//- Luckily, Java already provides us with "wrapper" classes around primitive types which will allow us to store data like Integers and Doubles in our Collections.
//
//### HashMap
//
//- Similar to Objects in JavaScript, HashMaps store data in key-value pairs
//- Keys should all be the same type
//- Values should all be the same type
//- Keys and Values do NOT have to be the same type. (ie. Keys are Strings and Values are Integers)
//
//[Assigning to ArrayList vs List](https://stackoverflow.com/questions/14974749/assigning-arraylist-to-list)





//    *** JAVA II - Collections ***
//
//Collections we will talk about: ArrayList and HashMap
//
//
//Collection:
//- a data structure that can be used to group, or collect, objects
//- Java standard library: a collection of code that comes with Java, contains collections
//- java.util package has collection classes
//
//
//Array Lists:
//- represents an array that can change its size
//- elements must all be objects, and same type
//- ArrayList is like a wrapper around an array that handles resizing for you
//- they have methods that handle common array operations
//
//SYNTAX: ArrayList<String> roasts = new ArrayList<>();
//
//Method	        Description
//.size	        returns the number of elements in the array
//.add	        add an element to the collection (optionally) at a specified index
//.get	        return the element at the specified index
//.indexOf        return the first found index of the given item, or -1 if not found
//.contains	    check if a collection contains a given element
//.lastIndexOf	find the last index of the given element, -1 if not found
//.isEmpty	    check if the list is empty
//.remove	        remove the first occurrence of an item, or an item at a given index
//
//NOTE:
//- specify type in collection with <>
//- must contain objects, we specify Integer instead of int
//- add method is overloaded
//- no length property, use .size()
//- collections all have toString methods on them
//- return value of .remove depends on how it is invoked (index returns element, object returns boolean)
//
//
//
//Hash Maps:
//- data structure for key-value pairs
//- ALL the keys in the hash map must be of the same type
//- ALL the values must be of the same type
//- BUT keys and the values don't necessarily have to be the same type
//
//SYNTAX: HashMap<String, String> usernames = new HashMap<>();
//
//Method	            Description
//.put	            set a key-value pair
//.get	            return the value associated with the given key, or null
//.getOrDefault	    like .get, but with a defined value instead of null
//.containsKey	    check if a key exists in the map
//.containsValue	    check if a value exists in the map



    public static void main(String[] args) {

//       ------------------------------------------ ArrayList ------------------------------------------
        ArrayList<Integer> favNumbers = new ArrayList<>();

        //Let's add some elements to our arrayList -
        favNumbers.add(7);  // adding an element
        //Number 7 isn't ACTUALLY my FAVORITE FAVORITE number -
        //I'd like to add in a number before it [index 0] that's my real favorite number
        favNumbers.add(0,222); // specifying an index
        favNumbers.add(2,13);


        //Let's go GET something at index X
        int myFavoriteFavoritenum = favNumbers.get(0);
        System.out.println("myFavoriteFavoritenum = " + myFavoriteFavoritenum);

        //Let's SEARCH for my second favorite number, '7'
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));
        //What if I'm feeling a little wild and want TRIPLE 7s
        System.out.println("favNumbers.indexOf(777) = " + favNumbers.indexOf(777));
        //What if there's two 7s inside of my arrayList?
        favNumbers.add(7);
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));

        //Let's see what we have so far as we work:
        System.out.println("favNumbers = " + favNumbers);

        //Let's track our arrayList's size as we work:
        System.out.println("favNumbers.size() = " + favNumbers.size());

        //With Strings - comparing them?
        ArrayList<String> favAuthors = new ArrayList<>();
        favAuthors.add("Vonnegut");
        favAuthors.add("Heinlein");
        favAuthors.add("W.C. Williams");
        favAuthors.add("Palmer Hall");

        System.out.println("favAuthors = " + favAuthors);

        ArrayList<String> copyFavAuthors = favAuthors;
        System.out.println("copyFavAuthors.equals(favAuthors) = " + copyFavAuthors.equals(favAuthors));
        copyFavAuthors.add("J.D. Salinger");
        System.out.println("copyFavAuthors.equals(favAuthors) = " + copyFavAuthors.equals(favAuthors));
        //Looks like .equals just checks the Object to Object vs the value of what is INSIDE the object

        //Other common methods: .contains; .lastIndexOf; isEmpty; .remove

        System.out.println("favAuthors.contains(\"Heinlein\") = " + favAuthors.contains("Heinlein"));
        System.out.println("favAuthors.contains(\"Asimov\") = " + favAuthors.contains("Asimov"));
        //What will happen? Do I need to look for "J.D. Salinger" or can I just do "Salinger"
        System.out.println("favAuthors.contains(\"Salinger\") = " + favAuthors.contains("Salinger"));

        System.out.println("favAuthors.contains(\"J.D. Salinger\") = " + favAuthors.contains("J.D. Salinger"));

        //Let's think about our earlier example: Let's go get that last 7!
        System.out.println();
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));
        //Salright - use the .lastIndexOf method to go get 'em :D
        System.out.println("favNumbers.lastIndexOf(7) = " + favNumbers.lastIndexOf(7));

        //isEmpty
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("emptyList.isEmpty() = " + emptyList.isEmpty());
        System.out.println("favAuthors.isEmpty() = " + favAuthors.isEmpty());

        //.remove() - well, WOOPS, let's get rid of that 7
        Integer toRemove = new Integer(7);
        favNumbers.remove( toRemove);
        System.out.println("favNumbers = " + favNumbers);

        //What if our arrayList had an index and value match?
        favNumbers.add(1,3);
        System.out.println("favNumbers = " + favNumbers);
        Integer removeThree = 3;
        //First: Let's send up the '3' as a numeric literal
        favNumbers.remove(3);
//        System.out.println("favNumbers = " + favNumbers);
        //Second: Let's send up this 'removeThree' Object
        favNumbers.remove(removeThree);
        System.out.println("favNumbers = " + favNumbers);





//       ------------------------------------------ HashMap ------------------------------------------
        HashMap<String, String> authorsBooks = new java.util.HashMap<>();

        authorsBooks.put("Kurt Vonnegut", "Cat's Cradle");
        authorsBooks.put("J.D. Salinger", "Franny and Zooey");

        //So - let's .get some keys and see their values
        System.out.println("authorsBooks.get(\"Kurt Vonnegut\") = " + authorsBooks.get("Kurt Vonnegut"));
        System.out.println("authorsBooks.get(\"Isaac Asimov\") = " + authorsBooks.get("Isaac Asimov"));

        //What if I didn't WANT null
        System.out.println("authorsBooks.getOrDefault(\"Isaac Asimov\", \"No book found for author\") = " + authorsBooks.getOrDefault("Isaac Asimov", "No book found for author"));

        //Well, how do I find if the key is in my HashMap?
        System.out.println("authorsBooks.containsKey(\"Isaac Asimov\") = " + authorsBooks.containsKey("Isaac Asimov"));
        System.out.println("authorsBooks.containsKey(\"Kurt Vonnegut\") = " + authorsBooks.containsKey("Kurt Vonnegut"));

        //Mo' methods, mo' problems
        //The situation: What if I don't want to override the key-value pair?
        authorsBooks.put("Kurt Vonnegut", "Slaughterhouse Five");
        //Instead of put - let's use PUT IF ABSENT
        authorsBooks.putIfAbsent("Kurt Vonnegut", "Welcome to The Monkey House");


        //Woops - someone added a controversial book :O Yikes! Let's use remove to avoid any problems. . .
        authorsBooks.put("Karl Marx", "The Communist Manifesto");
        authorsBooks.remove("Karl Marx");



        //Aight - that's ALL GRAVY, what if I wanted to just replace something without having to go through the entire put method?
        authorsBooks.replace("J.D. Salinger", "Nine Stories");

        System.out.println("authorsBooks = " + authorsBooks);
        System.out.println("Let's empty this HashMap Out!");
        authorsBooks.clear();
        System.out.println("authorsBooks = " + authorsBooks);
        System.out.println("authorsBooks.isEmpty() = " + authorsBooks.isEmpty());
    }
}
