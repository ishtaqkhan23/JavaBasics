package javabasics.thread.runnableinterface;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main Thread Running");

        Thread alphabetPrinterThread = new Thread(new AlphabetPrinterThread());
        alphabetPrinterThread.start();
        //alphabetPrinterThread.run();

        Thread numberPrinterThread = new Thread(new NumberPrinterThread());
        numberPrinterThread.start();
        //numberPrinterThread.run();
    }
}
