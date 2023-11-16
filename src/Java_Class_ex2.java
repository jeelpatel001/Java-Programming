// WAP using class Person to display name and age with method.
class People {
    String name;
    int age;

    public void displayName() {
        System.out.println("name=" + name);
    }

    public void displayAge() {
        System.out.println("age=" + age);
    }
}

public class Java_Class_ex2 {
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();

        p1.name = "modi";
        p1.age = 71;
        p2.name = "bachchan";
        p2.age = 80;

        p1.displayName();
        p1.displayAge();

        System.out.println();  // for new line

        p2.displayName();
        p2.displayAge();
    }
}