package Multithreading;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecTutorial {

    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with a fixed pool size of 3
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        
        // Submit tasks to the executor
        for (int i = 1; i <= 5; i++) {
            RunnableTask task = new RunnableTask("Task " + i);
            System.out.println("Submitting " + task.getName() + " for execution.");
            executor.execute(task);
        }
        
        // Shutdown the executor after all tasks are submitted
        executor.shutdown();
    }
    
    private static class RunnableTask implements Runnable {
        private String name;
        
        public RunnableTask(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
        
        public void run() {
            System.out.println("Executing " + name);
            try {
                // Simulate some work
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " finished execution.");
        }
    }
}
