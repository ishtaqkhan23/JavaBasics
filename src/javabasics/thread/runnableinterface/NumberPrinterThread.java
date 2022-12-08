package javabasics.thread.runnableinterface;

public class NumberPrinterThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.println("Printing Number : " + i);
        }
    }
}
