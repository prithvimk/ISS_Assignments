package Multithreading;
public class MultithreadingDemo {
    
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        
        // Start the threads
        thread1.start();
        thread2.start();
        
        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread exiting.");
    }
    
    private static class MyThread extends Thread {
        private String name;
        
        public MyThread(String name) {
            this.name = name;
        }
        
        public void run() {
            System.out.println("Thread " + name + " started.");
            
            try {
                // Simulate some work
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread " + name + ": " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("Thread " + name + " finished.");
        }
    }
}
