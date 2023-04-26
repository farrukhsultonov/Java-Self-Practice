package grades;

import java.util.HashMap;
import java.util.Scanner;

import util.Input;


public class GradesApplication {
    public static void studentInformation(HashMap<String, Student> students) {
        System.out.println("Welcome <insert teacher name here>! \nHere are our current student's GitHub usernames: ");
        System.out.print("| ");
        for (String username : students.keySet()) {
            System.out.print(username + " | ");
        }
        String answer;
        do {
            System.out.println("\nWhat student would you like to see more information on?");
            String studentRequest = Input.getString();
            if (students.containsKey(studentRequest)) {
                System.out.println("Name: " + students.get(studentRequest).getName() + " | GitHub: " + studentRequest + " | Grade Average: " + students.get(studentRequest).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the github username %s.", studentRequest);
            }
            System.out.println("Would you like to search for another student? (y/n)");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
        } while (answer.equals("y"));
        System.out.println("Have a nice day.");
    }


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student joshua = new Student("joshua");
        joshua.addGrade(89);
        joshua.addGrade(100);
        joshua.addGrade(50);
        students.put("joshua-m", joshua);

        Student roger = new Student("roger");
        roger.addGrade(98);
        roger.addGrade(72);
        roger.addGrade(83);
        students.put("rogerthedude", roger);

        Student doug = new Student("doug");
        doug.addGrade(54);
        doug.addGrade(105);
        doug.addGrade(79);
        students.put("douggie", doug);

        Student louise = new Student("louise");
        louise.addGrade(100);
        louise.addGrade(99);
        louise.addGrade(97);
        students.put("louise-apple", louise);

        studentInformation(students);
    }
}