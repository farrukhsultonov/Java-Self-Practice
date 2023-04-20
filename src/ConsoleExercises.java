import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        PART 1
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);

//      PART 2 section 1
        Scanner sc = new Scanner(System.in);
//        System.out.println("Give me a number.");
//        int userNum = scanner.nextInt();
//        System.out.println(userNum);

        //      PART 2 section 2
//        System.out.print("Enter three words: ");
//        String wordOne = sc.next();
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//        System.out.printf("%s %s %s.%n", wordOne, wordTwo, wordThree);

        //      PART 2 section 3 and section 4
//        System.out.println("Enter a sentence:");
//        String sentence = sc.next();
////        String sentence = sc.nextLine();
//        System.out.println(sentence);


//        //      PART 3 section 1
//        System.out.println("Enter the length of the room: ");
//        String lengthStr = sc.nextLine();
//        int lengthNum = Integer.parseInt((lengthStr));
//
//        System.out.println("Give me the width of the classroom.");
//        String widthStr = sc.nextLine();
//        int widthNum = Integer.parseInt(widthStr);
////
//
//        int area = lengthNum * widthNum;
//        int perimeter = (2 * lengthNum) + (2 * widthNum);
//        System.out.printf("Area %s %n Perimeter %s %n", area, perimeter);


//        the scanner defaults its delimeter to white space
//        useDelimiter

//         // BONUS
        sc.useDelimiter("\n");

        System.out.println("Please enter the length of the classroom: ");
        double length = sc.nextDouble();

        System.out.println("Please enter the width of the classroom: ");
        double width = sc.nextDouble();

        System.out.println("Please enter the height of the classroom: ");
        double height = sc.nextDouble();

        double perimeter = (length + width) * 2;
        double area = length * width;
        double volume = length * width * height;

        System.out.printf("The perimeter is: %.2f%n", perimeter);
        System.out.printf("The area is: %.2f%n", area);
        System.out.printf("The volume is: %.2f", volume);
    }
}