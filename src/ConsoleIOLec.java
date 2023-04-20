import java.util.Scanner;


public class ConsoleIOLec {

    public static void main(String[] args){
        String name = "Kotlin";
//        no new line, just plane old concatenation
        System.out.print("Happy Monday, " + name);
//        concatenating with a newline by passing the \n
        System.out.print("Happy Monday, " + name + "\n");
//        concatenating with a newline by using the println
        System.out.println("Happy Monday, " + name);

//        the "f" in the printf stands for format.
//        the "%s" is the placeholder or where the string variable will be formatted into our sentence. Saves you from concatenation
        System.out.printf("Hello there, %s. Nice to see you.%n", name);

//        if we want to get data from our user, we don't have a window object with a prompt or a window object with any kind of a confirm.
//        So how do we interact with the user?
//        We use the Scanner class. To use the Scanner class we have to tell java we want to use it.
//        This is where we  use imports
//        there is minimum viable amount of java that gets installed the development environment, the runtime environment, the virtual machine, but if you needed a little more functionality, if we needed maybe extra library of somekind, we are going to go through somekind of packages.
//        what is a package? A package is a group of related code.
//- a namespace for a group of related code
//- we'll define classes in their own packages
//- for now, we'll be using code from the java.util package

//        We are going to go out into the environment and say I need to use that and bring it in to our java. We do that through the import statement.
//        Import Statements:
//        - what let us use code from other packages
//                - include code from different directories and Java libraries
//                - eventually, every class you create will end up with multiple import statements
//                - imports go at the top of your file, before the class definition
//        - import the Scanner class from the java.util package

//        Scanner Inputs:
//scanner.next()          word
//scanner.nextLine()      line
//scanner.nextInt()       number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


            
        // User input integers!
        System.out.print("What's your favorite number? ");
        int favoriteNumber = scanner.nextInt();
        System.out.println(favoriteNumber);

        // Lines and scanners!
        scanner.nextLine();
        System.out.println("What's your favorite color?");
        String favColor = scanner.nextLine();
        System.out.println(favColor);
    }
}
