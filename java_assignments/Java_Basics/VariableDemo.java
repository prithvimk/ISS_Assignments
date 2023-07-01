package Java_Basics;
public class VariableDemo {
    // Class variable
    static int classVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    public static void main(String[] args) {
        // Local variable: 
        int localVariable = 30;

        System.out.println("Class variable: " + classVariable);
        
        VariableDemo demo = new VariableDemo();
        System.out.println("Instance variable: " + demo.instanceVariable);
        
        System.out.println("Local variable: " + localVariable);
    }
}
