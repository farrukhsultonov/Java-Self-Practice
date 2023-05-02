package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student james = new Student("james");


        james.addGrade(89);
        james.addGrade(100);
        james.addGrade(50);
        System.out.println(james.getName());
        System.out.println(james.getGradeAverage());
    }

}