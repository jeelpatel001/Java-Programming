class MyName{
    MyName(){
        System.out.println("My Name is Jeel Bhensadadiya");
    }
    MyName(String name){
        System.out.println(name);
    }
}
public class Java_Constructor {

    public static void main(String[] args) {
        // You can create  anonymous objects and call the constructors without assigning them to variables
        new MyName();
        new MyName("Jeel Bhensadadiya");

    }
}
