package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student joshua = new Student("joshua");


        joshua.addGrade(89);
        joshua.addGrade(100);
        joshua.addGrade(50);
        System.out.println(joshua.getName());
        System.out.println(joshua.getGradeAverage());
    }

}