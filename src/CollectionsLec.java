import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {

//    Java Collections

//### What is a Data Structure?

//- A way of storing and organizing data for effective access and modification.

//### What are Collections?

//- A Collection is a data structure that can be used to store and group objects.
//- Java Collections are not part of the native language, but are included in the Java standard library.
//- Collection is actually an interface that is extended by a few sub-interfaces like List, Set and Queue.
//- Today we will be covering a specific subtype of List: ArrayList

//[Java Docs - Collection interface](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)

//### What are Maps?

//- Maps are another data structure provided in the Java standard library.
//- It is not a subtype of Collection, therefore it behaves differently.
//- Maps are intended to store key-value pairs, similar to Objects in JavaScript.
//- Today we will be covering a specific subtype of Map: HashMap

//** Both of these libraries can be imported into a Class for use **

//### ArrayList

//- The ArrayList type acts like a wrapper around a native Java array.
//- The methods available on an ArrayList allow us to easily manipulate the ArrayList when adding or accessing elements.
//- Unlike Arrays in JavaScript however, ArrayLists can only hold Objects and they must be of the same type.
//- Luckily, Java already provides us with "wrapper" classes around primitive types which will allow us to store data like Integers and Doubles in our Collections.

//### HashMap

//- Similar to Objects in JavaScript, HashMaps store data in key-value pairs
//- Keys should all be the same type
//- Values should all be the same type
//- Keys and Values do NOT have to be the same type. (ie. Keys are Strings and Values are Integers)

//[Assigning to ArrayList vs List](https://stackoverflow.com/questions/14974749/assigning-arraylist-to-list)



//    *** JAVA II - Collections ***

//Collections we will talk about: ArrayList and HashMap

//Collection:
//- a data structure that can be used to group, or collect, objects
//- Java standard library: a collection of code that comes with Java, contains collections
//- java.util package has collection classes


//Array Lists:
//- represents an array that can change its size
//- elements must all be objects, and same type
//- ArrayList is like a wrapper around an array that handles resizing for you
//- they have methods that handle common array operations

//SYNTAX: ArrayList<String> roasts = new ArrayList<>();


//NOTE:
//- specify type in collection with <>
//- must contain objects, we specify Integer instead of int
//- add method is overloaded
//- no length property, use .size()
//- collections all have toString methods on them
//- return value of .remove depends on how it is invoked (index returns element, object returns boolean)



//Hash Maps:
//- data structure for key-value pairs
//- ALL the keys in the hash map must be of the same type
//- ALL the values must be of the same type
//- BUT keys and the values don't necessarily have to be the same type

//SYNTAX: HashMap<String, String> usernames = new HashMap<>();



    public static void main(String[] args) {

//       ------------------------------------------ ArrayList ------------------------------------------
        ArrayList<Integer> favNumbers = new ArrayList<>();

        //Let's add some elements to our arrayList -
        favNumbers.add(7);  // adding an element
        //Number 7 isn't ACTUALLY my FAVORITE FAVORITE number -
        //I'd like to add in a number before it [index 0] that's my real favorite number
        favNumbers.add(0,222); // specifying an index
        favNumbers.add(2,13);

        System.out.println(favNumbers);


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
        favNumbers.remove(toRemove);
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
        // We'll start by defining a hash map
        HashMap<Integer, String> usernames = new HashMap<>();

// and putting some data into it
        usernames.put(1, "ryanorsinger");
        usernames.put(2, "zgulde");
        usernames.put(3, "fmendozaro");
        usernames.put(4, "jreich5");

        System.out.println(usernames);
// {1=ryanorsinger, 2=zgulde, 3=fmendozaro, 4=jreich5}

// obtaining values from the hash map by key
        usernames.get(1); // "ryanorsinger"
        usernames.get(5); // null
        usernames.getOrDefault(6, "gocodeup"); // "gocodeup"

// checking if keys or values are present
        usernames.containsKey(3); // true
        usernames.containsValue("fmendozaro"); // true

        for(int i = 1; i < usernames.size(); i++){
            System.out.println(usernames.get(i));
        }

        usernames.replace(1, "jordysol");
        System.out.println(usernames.get(1));
        usernames.remove(2);
        usernames.putIfAbsent(5, "sergio");
        System.out.println(usernames.get(5));


//        -------------------------------- Why use an ArrayList vs. a HashMap? --------------------------------
//        ArrayList and HashMap are two different data structures in Java that serve different purposes.

//ArrayList is a dynamic array that can store a collection of elements of the same type. It is an ordered collection, meaning that the elements in the list have a specific order, and each element can be accessed using an index. ArrayList is useful when you want to store and retrieve elements sequentially, and you know the index of the element you want to access.

//HashMap, on the other hand, is an implementation of a hash table, which is a data structure that stores key-value pairs. Each element in the map is identified by a unique key, and the value associated with that key can be retrieved efficiently. HashMap is useful when you want to store and retrieve elements based on a specific key, rather than their position in the collection.

//So, the choice between ArrayList and HashMap depends on what you want to do with your data. If you need to access your elements based on their position in the list, use ArrayList. If you need to access your elements based on a specific key, use HashMap.



        //        -------------------------------- Why use an Array vs. an ArrayList? --------------------------------
//        Arrays and ArrayLists are both used to store collections of elements in Java, but they have some differences that make them more suitable for different scenarios.

//Arrays are fixed-size collections of elements that can be of any type. Once an array is created, its size cannot be changed. Arrays are generally more efficient in terms of memory usage and performance when accessing elements by index. They are a good choice when you know the size of the collection beforehand and you don't need to add or remove elements frequently.

//ArrayLists, on the other hand, are dynamic arrays that can grow or shrink in size as needed. They are implemented using an array internally, but they provide additional methods for adding, removing, and accessing elements. ArrayLists are a good choice when you need to add or remove elements frequently, or when you don't know the size of the collection beforehand.

//In general, if you need to create a fixed-size collection of elements and you know the size beforehand, it's more efficient to use an array. If you need a dynamic collection that can grow or shrink in size, or if you need to add or remove elements frequently, it's more convenient to use an ArrayList.
    }
}
