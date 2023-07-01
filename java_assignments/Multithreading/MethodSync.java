package Multithreading;

class Printer {
    public synchronized void printDocument(String document) {
        System.out.println("Printing document: " + document);
        try {
            Thread.sleep(1000); // Simulating printing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Document printed: " + document);
    }
}

class UserThread extends Thread {
    private Printer printer;
    private String document;

    public UserThread(Printer printer, String document) {
        this.printer = printer;
        this.document = document;
    }

    @Override
    public void run() {
        printer.printDocument(document);
    }
}

public class MethodSync {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Creating multiple threads representing users printing documents
        Thread user1 = new UserThread(printer, "Document 1");
        Thread user2 = new UserThread(printer, "Document 2");
        Thread user3 = new UserThread(printer, "Document 3");

        // Starting the threads
        user1.start();
        user2.start();
        user3.start();
    }
}

