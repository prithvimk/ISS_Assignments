package Java_Basics;
public class AccessModifiersDemo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Accessing publicVariable, privateVariable and protectedVariable
        System.out.println("Public variable: " + myClass.publicVariable);
        System.out.println("Private variable: This will cause a compilation error"); // Cannot access private variable outside the class
        System.out.println("Protected variable: " + myClass.protectedVariable);

        // Accessing privateVariable through a public method
        myClass.accessPrivateVariable();
    }
}

class MyClass {
    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;

    public void accessPrivateVariable() {
        System.out.println("Private variable accessed through a public method: " + privateVariable);
    }
}
