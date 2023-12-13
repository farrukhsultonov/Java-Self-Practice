//import java.util.Scanner;
//
//public class MethodsExercises {
//
//    public static void main(String[] args){
////        int num1 = 10;
////        int num2 = 2;
////        System.out.println(add(num1, num2));
////        System.out.println(sub(num1, num2));
////        System.out.println(mult(num1, num2));
////        System.out.println(div(num1, num2));
////        System.out.println(mod(num1, num2));
////
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial());
////
////        System.out.println(dice());
//
//    }
//
//
////    public static int add(int num1, int num2){
////        return num1 + num2;
////    }
////
////    public static int sub(int num1, int num2){
////        return num1 - num2;
////    }
////
////    public static int mult(int num1, int num2){
////        return num1 * num2;
////    }
////
////    public static double div(double num1, double num2){
////        return num1/num2;
////    }
//
////    public static double mod(double num1, double num2){
////        return num1%num2;
////    }
//
//    public static int getInteger(int min, int max){
//        System.out.println("Enter a number between " + min + " and " + max);
//        Scanner scanner = new Scanner(System.in);
//        int userInput;
//        userInput = scanner.nextInt();
//        if(userInput >= min && userInput <= max){
//            return userInput;
//        }
//        return getInteger(min, max);
//    }
//
//    private static long factorial(){
//        int NumToFactorialize = getInteger(1, 10);
//        long currentSum = 1;
//        for(int counter = 1; counter <= NumToFactorialize; counter++){
//            currentSum *= counter;
//        }
//        boolean userChoice = cont();
//        if(userChoice){
//            factorial();
//        }
//        return currentSum;
//    }
//
//    public static boolean cont(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("would you like to go again?");
//        String answer = scanner.nextLine();
//        if (answer.equals("yes")){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
////    public static int dice(){
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("how many sides does your dice have?");
////        int sides = scanner.nextInt();
////        int dice1 = (int) ((Math.random() * sides) + 1);
////        int dice2 = (int) ((Math.random() * sides) + 1);
////        return dice1 + dice2;
////    }
//
//
//}




import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args){
//        int num1 = 10;
//        int num2 = 2;
//        System.out.println(add(num1, num2));
//        System.out.println(sub(num1, num2));
//        System.out.println(mult(num1, num2));
//        System.out.println(div(num1, num2));
//        System.out.println(mod(num1, num2));

//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial());

        System.out.println(dice());

    }


    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mult(int num1, int num2){
        return num1 * num2;
    }

    public static double div(double num1, double num2){
        return num1/num2;
    }

    public static double mod(double num1, double num2){
        return num1%num2;
    }

    public static int getInteger(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        Scanner scanner = new Scanner(System.in);
        int userInput;
        userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }
        return getInteger(min, max);
    }

    private static long factorial(){
        int NumToFactorialize = getInteger(1, 10);
        long currentSum = 1;
        for(int counter = 1; counter <= NumToFactorialize; counter++){
            currentSum *= counter;
        }
        boolean userChoice = cont();
        if(userChoice){
            factorial();
        }
        return currentSum;
    }

    public static boolean cont(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to go again?");
        String answer = scanner.nextLine();
        if (answer.equals("yes")){
            return true;
        }else {
            return false;
        }
    }

    public static int dice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many sides does your dice have?");
        int sides = scanner.nextInt();
        int dice1 = (int) ((Math.random() * sides) + 1);
        int dice2 = (int) ((Math.random() * sides) + 1);
        return dice1 + dice2;
    }


}