package javabasics.thread.runnableinterface;

public class AlphabetPrinterThread implements Runnable {
    @Override
    public void run() {
        for (int i = 97; i <= 122; i++) {
            char alphabet = (char) i;
            System.out.println("Printing Alphabet : " + alphabet);
        }
    }
}
