public class Person {
    // Constructors
    public Person(String name) {
        this.name = name;
    }

    // Variables/Fields
    private String name;

    // Methods
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello there, " + this.name + "!");
    }

    // main method
    public static void main(String[] args) {
        // Exercise 1
        Person person = new Person("Phillis");
        System.out.println(person.getName());
        person.sayHello();
        person.setName("Mia");
        person.sayHello();

        // Exercise 2
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));  // true
        System.out.println(person1 == person2);   // false

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);     // true

        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());  // John
        System.out.println(person6.getName());  // John
        person6.setName("Jane");
        System.out.println(person5.getName());  // Jane
        System.out.println(person6.getName());  // Jane
    }
}