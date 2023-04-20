package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("true");

    }

    public static int getInt(int min, int max){
        System.out.printf("Give me a number between %s and %s", min, max);
        int userNum = scanner.nextInt();
        if(userNum < min || userNum > max) {
            getInt(min, max);
        }
        return userNum;
    }

    public static int getInt(){
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max){
        System.out.printf("Give me a number between %s and %s", min, max);
        double userNum = scanner.nextDouble();
        if(userNum < min || userNum > max) {
            userNum = getDouble(min, max);
        }
        return userNum;
    }

    public static double getDouble(){
        return scanner.nextDouble();
    }


}