class Person {
    String name; // Default value: null
    int age;     // Default value: 0

    // Default constructor
    Person() {
        this(25, "pratham");
    }

    // Parameterized constructor
    Person(int age, String name) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructorExample {

    // Method to modify the name of a Person object
    public static void modifyName(Person p) {
        p.name = "Neha";
    }

    public static void main(String[] args) {
        // Create a Person object using the default constructor
        Person p = new Person();
        System.out.println("Name: " + p.name + ", Age: " + p.age);
        //System.out.println("Name: " + person.name + ", Age: " + person.age);

        // Modify the name of the Person object
       // modifyName(person);
       // System.out.println("Modified Name: " + person.name);
    }
}
