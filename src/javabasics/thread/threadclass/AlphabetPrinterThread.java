package javabasics.thread.threadclass;

public class AlphabetPrinterThread extends Thread {
    @Override
    public void run() {
        for (int i = 97; i <= 122; i++) {
            System.out.println("AlphabetPrinter Thread Name is : " + Thread.currentThread().getName());
            char alphabet = (char) i;
            System.out.println("Printing Alphabet : " + alphabet);
        }
    }
}
