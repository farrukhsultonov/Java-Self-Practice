import java.util.Scanner;

//    Methods
//
//    Today's Agenda:
//    - Defining Methods
//    - Calling Methods
//    - Method Overloading
//    - Passing Parameters to Methods
//    - Recursion

public class MethodLecture {
    public static void main(String[] args) {


        //            Example:
        //-- Method without argument
        System.out.println(startingApplication());

        //-- Method with 2 arguments
        System.out.println(sayHello("Helloooooooo", "Bob"));

        //-- Method with 2 int arguments
        System.out.println(addingNums(1,2));

        //-- Method with incorrect arguments
        //-- Look at the red underline
        //-- Hover and will be notified
//        System.out.println(addingNums("hey","bob"));

        System.out.println(birthday("susie", 21));



        //Version One
        System.out.println( "Version One: "+ sayHello());
        System.out.println();

        //Version Two
        System.out.println("Version Two: \n"+ sayHello(10));
        System.out.println();

        //Version Three
        System.out.println("Version Three: "+ sayHello("Hello", "bob"));
        System.out.println();

        //Version Four
        System.out.println("Version Four: "+ sayHello("Sassy"));
        System.out.println();


        String changeMe = "hello codeup!";
        changeString(changeMe);
        System.out.println(changeMe);


        count(10);

        iSpy("dog", "furry");


//        // Example invocation of getPower method
        int base = 3;
        int exponent = 2;
        long result = getPower(base, exponent);

//        // Display the result
        System.out.println(base + " ^ " + exponent + " = " + result);
    }

//    Defining Methods
//    - Methods are similar to functions, meaning it is built to perform a specific task
//    - Similar to functions in JS, methods accept parameters and produce an output

//    Basic Syntax:
//    public static returnType methodName([param1[, param2[, ...]]) {
        // the statements of the method
        // a return statement, if a return type is declared
//    }

//        * public: is the visibility modified
//            - shows that this method can be accessed by code outside of the class
//        * static:
//            - When declared it states the method belongs to the class rather than a specific instance.
//            - Meaning it can be called without creating an instance of the class.
//            - Allows a method, to be called before an object of the class is created,
//            - Static Methods can: access static data directly & call other static methods only
//
//        * returnType:
//            - THis is the return type of the method
//            - All methods must define the type of the value they will return
//            - If there is no return, use the special keyword 'void'

//        * methodName
//            - The name of the function/method

//        * param1:
//             Parameters the method accepts
//            - A method can have no parameters, one parameters, or multiple parameters.
//            - Must include the type that specifies each parameter.
//            * Everything inside the curly braces is the body of the method.
//
//        - When building methods, they will need to be on the outside of the main method.

//    Example:
    //-- Method without parameter
    public static String startingApplication(){
        return "Beep Boop Starting Application!";
    }

//    //-- Method with two strings parameters
//    public static void sayHello(String greeting, String name) {
//        System.out.printf("%s, %s!\n", greeting, name);
//    }

    //-- Method with two int parameters
    public static int addingNums(int num1, int num2){
        return num1 + num2;
    }

    //-- Method with two parameters, 1 string and 1 int
    public static String birthday(String name, int num1){
        return "Happy Birthday "+name+", You are "+num1+"!";
    }


//    Calling Methods:
//    - Now that we know how to define a method, now lets call or invoke the method.
//    - Calling a method will be inside of the main method.
//    - When we built a method with parameters, we then call it with an 'argument'
//    - Arguments can be literal values, variables that will be evaluated to a value that is passed to the method.
//    - Member that the data type of the argument must be the same as the data type of the parameters that the method is defined with.


//    Method Overloading:
//    - is when multiple methods have the same name, but different parameters types, parameter order, or number of parameters
//    - When overloading methods, you can call other version of themselves, and are commonly used to provide default values for arguments
//
//    Example:
    //-- Method Overload with No Parameter
    public static String sayHello(){
        return "Hello Hello";
    }
//
//    //-- Method Overload with int Parameter
    public static String sayHello(int times) {
        String value = "";
        for (int i = 0; i < times; i += 1) {
            value += sayHello()+"\n";
        }
        return value;
    }
//
//    //-- Method Overload with 2 strings Parameter
    public static String sayHello(String greeting, String name){
        return greeting+" "+name;
    }
//
//    //-- Method Overload with 1 string Parameter
    public static String sayHello(String name){
        return sayHello("hello", name);
    }


//    Passing Parameter to Methods
//    - When you pass a value to the argument, a copy of the value passed is created inside of a method and it reassigns a value inside of a method
//    - it will not change it outside of the method.

//            Exercise:
    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
        System.out.println(s);
    }





//    ------------------------- Recursion: ------------------------------------
//            - A concept that aims to solve a problem by dividing it into smaller chunks.
//            - The core idea is to create a method that calls itself, with different parameters than originally passed.
//            - It is important to have a 'base case' or a 'stop condition' so that the method does not call itself over and over indefinitely.

    public static void count(int n) {
//        if we comment out the condition below the code will run indefinitely, and we get a stackoverflow error. That is because the allocated space for this method has exceeded it's limit. A stack overflow error occurs when the call stack, which is a region of memory used for function call management, runs out of space. Each time a method is called, a new stack frame is created to store local variables and information about the function call. When a function returns, its stack frame is removed. In the absence of a base case, the recursive calls in your count method keep piling up on the call stack, and since there is no termination condition, it eventually overflows, leading to a stack overflow error.
        if (n <= 0) {
            System.out.println("All done!");
            // Base case: stop recursion when n is less than or equal to zero
            return;
        }
//        recursive method called count that prints the value of n and then calls itself with the argument n - 1.
        System.out.println(n);
        count(n - 1);
    }




//    second curriculum example of recursion
//public static long getPower(int base, int exponent) {
//    long result = 1;
//    for (int i = 1; i <= exponent; i++) {
//        result = result * base;
//    }
//    return result;
//}


    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }


//    another example of recursion
    public static void iSpy(String objectToFind, String hint) {
        System.out.println("Player1: I spy with my little eyes something " + hint.concat("!"));
        Scanner spyaneer = new Scanner(System.in);
        String guess = spyaneer.nextLine();
        System.out.println("Player2: I spy, with my little eyes " + guess);
        if (guess.equalsIgnoreCase(objectToFind)) {
            System.out.println("Ayo you win!");
            return;
        }
        System.out.println("keep guessing!");
        iSpy(objectToFind, hint);
    }
}

