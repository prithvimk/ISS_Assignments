package Multithreading;

public class ThreadSafety {

    private int instanceCounter = 0;

    public void incrementInstanceCounter() {
        synchronized (this) { // Block synchronized
            instanceCounter++;
        }
    }
    
    public void performLocalVariableOperations() {
        int localVarCounter = 0;
        localVarCounter++;
        System.out.println("Local variable counter: " + localVarCounter);
    }

    public static void main(String[] args) {
        final ThreadSafety example = new ThreadSafety();

        // Creating multiple threads to access instance variable
        Runnable instanceCounterRunnable = () -> {
            for (int i = 0; i < 5; i++) {
                example.incrementInstanceCounter();
                System.out.println("Instance variable counter: " + example.instanceCounter);
            }
        };

        // Creating multiple threads to access local variable
        Runnable localVariableRunnable = () -> {
            for (int i = 0; i < 5; i++) {
                example.performLocalVariableOperations();
            }
        };

        // Start the threads
        Thread[] instanceThreads = new Thread[5];
        for (int i = 0; i < instanceThreads.length; i++) {
            instanceThreads[i] = new Thread(instanceCounterRunnable);
            instanceThreads[i].start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Thread[] localVariableThreads = new Thread[5];
        for (int i = 0; i < localVariableThreads.length; i++) {
            localVariableThreads[i] = new Thread(localVariableRunnable);
            localVariableThreads[i].start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
