import java.util.Scanner;

public class StringsLec {
    public static void main(String[] args) {


//        This lesson is about the String data type in programming, which is used to represent a sequence of letters, numbers, and symbols. Unlike other types, strings are objects and are immutable, which means that once a string is created, it cannot be changed. We can concatenate strings by using the + operator or the concat method on a string object. Since strings are objects, we must use methods like .equals and .equalsIgnoreCase to compare them instead of the relational operators. There are also several methods that we can use to manipulate strings, such as .charAt, .indexOf, .substring, .toLowerCase, and .toUpperCase.

//        Focus: how to work with and manipulate strings.
//
//
//String Definition:
//- a String is letters, numbers, and special characters strung together
//- strings are objects, not primitives
//- String variables are a reference type, not a primitive type
//- the == operator with two objects checks if both sides are the same reference, if they refer to the same object
//
//
//Immutability and Concatenation:
//- strings are immutable
//- once a string is created, it cannot be changed
//- string concatenation (message + " World"), we aren't modifying the original string
//- we are creating a new String object
//- and updating the message variable to reference the new String object instead of the old one
//
//    String message = "Hello";
//    message = message + " World!";
//
//NOTE: Concatenation
//In Java, the + operator performs string concatenation when one of its operands is a String;
//it will convert any other types to a String as well. Another way to do this is with the concat
//method on any string object.
//
//
//Comparing Strings:
//- strings are not primitive data types but objects
//- must objects, we must use methods to compare
//
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Continue? [y/N] ")
//    String userInput = sc.next();
//
//    // Don't do this!
//    boolean confirmation = userInput == "y";
//
//------------ NOTE ----------------
//
//String Literal Comparison:
//
//- Because of how the JVM is implemented (which is well beyond the scope of this course),
//  the following example will print "Strings are equal"
//
//    // DON'T DO THIS
//    if ("I am a string" == "I am a string") {
//      System.out.println("Strings are equal");
//    }
//
//- But in general we cannot rely on that behavior, and should use either the equals or equalsIgnoreCase
//  method on a string object to compare string values.
//
//    // Do this instead!
//    if ("I am a string".equals("I am a string")) {
//      System.out.println("Strings are equal");
//    }
//
//----------------------------
//
//
//String Comparison Methods:
//    method	            description
//    .equals	            determine, case-sensitively, if two strings have the same value.
//    .equalsIgnoreCase	determine if two strings have the same value, disregarding their casing.
//    .startsWith	        determine, case-sensitively, if one string starts with another.
//    .endsWith	        determine, case-sensitively, if one string ends with another.
//
//
//String Manipulation Methods:
//    char charAt(int index);
//    int indexOf(String subString);
//    int lastIndexOf(String subString);
//    int length();
//    String replace(String pattern, String replacement);
//    String substring(int beginIndex[, int endIndex]);
//    String toLowerCase();
//    String toUpperCase();
//    String trim();

                // STRINGS ARE IMMUTABLE!

//        the "name variable" isn't the string object itself. it is a reference to the string object it creates in memory, with the value of "John". But when you take this name variable and assign it a new value, java doesn't modify this string object in memory. What it does is create a brand new string object in memory with the value "Larry" and changes the name variable to point to that string object instead and it no longer points to that "John" string. When we say string object are immutable, we are talking about the string objects in memory, the string variables themselves can be changed to point to whatever string we want. its the string object themselves that are not changeable they are immutable.
//        Why does this matter?
//        it enables java to save a ton of memory space.
//        when we create another string with the same value, Java create another variable. But it points to the same string object that exists in the "String pool".
//                String name = "John";
//        System.out.println(name);
//                name = name + "Larry";
//        System.out.println(name);

//                String anotherName = "John";

//                String thirdName = new String("John");

//                System.out.println(name == anotherName);

//                the benefit of this is that it saves lots of memory storage



//                String helloMsg = "Hello, how's it going?";
//                System.out.println(helloMsg);
//
//                System.out.println(helloMsg.concat(" Are you busy?"));
//
//                // Redefining Strings
//                String myName = "Mia";
//                myName = myName.concat(" Evans");
//                System.out.println(myName);
//
//                // Comparing Strings
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Continue? [y/n] ");
//                String userInput = sc.next();
//                // boolean confirm = userInput == "y";
//                // boolean confirm = userInput.equals("y");
//                boolean confirm = userInput.equalsIgnoreCase("y");
//                System.out.println(confirm);

                // Chaining Methods: Pass undefined variables into predefined variable methods!
//                String input = "yes";
//                System.out.println("Continue? [yes/no]");
//                String userInput2 = sc.next();
//                System.out.println(input.startsWith(userInput2.toLowerCase()));

                // String manipulation
//                String manipulation = "String to manipulate.";
//                System.out.println(manipulation.charAt(4));
//                System.out.println(manipulation.indexOf("y"));
//                System.out.println(manipulation.lastIndexOf("n"));
//                System.out.println(manipulation.length());
//                System.out.println(manipulation.replace("manipulate", "change"));
//                System.out.println(manipulation.substring(10, 20));
//                System.out.println(manipulation.toLowerCase());
//                System.out.println(manipulation.toUpperCase());
//                System.out.println(manipulation.replace("manipulate", "yeah yeah yeah".toUpperCase()))
//                System.out.println(manipulation.trim());


//        ------------ more examples if need ---------------------------
//        String str = "Hello World";
//
//// charAt method
//        char c = str.charAt(1); // returns 'e'
//
//// indexOf method
//        int index = str.indexOf("o"); // returns 4
//
//// lastIndexOf method
//        int lastIndex = str.lastIndexOf("o"); // returns 7
//
//// length method
//        int length = str.length(); // returns 11
//
//// replace method
//        String newStr = str.replace("o", "i"); // returns "Helli Wirld"
//
//// substring method
//        String subStr1 = str.substring(6); // returns "World"
//        String subStr2 = str.substring(0, 5); // returns "Hello"
//
//// toLowerCase method
//        String lowerStr = str.toLowerCase(); // returns "hello world"
//
//// toUpperCase method
//        String upperStr = str.toUpperCase(); // returns "HELLO WORLD"
//
//// trim method
//        String trimmedStr = "   Hello World   ".trim(); // returns "Hello World"


        String car = "Hello";
        String thirdName = new String("Hello");

        System.out.println(car == thirdName);
            }
        }
