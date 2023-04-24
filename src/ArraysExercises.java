import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        Person person1 = new Person("joe");
        Person person2 = new Person("jay");
        Person person3 = new Person("nikki");
        Person person4 = new Person("will");
        Person person5 = new Person("bill");

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        for(Person person: people){
            System.out.println(person.getName());
        }

        addPerson(people, person4);
        addPerson(people, person5);
    }

    public static Person[] addPerson(Person[] oldArr, Person newPerson){
        Person[] newArr = Arrays.copyOf(oldArr, oldArr.length + 1);
        newArr[oldArr.length - 1] = newPerson;

        System.out.println(newArr[oldArr.length - 1].getName());
        return newArr;
    }
}