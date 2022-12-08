package javabasics.thread.threadclass;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread Started.. ");
        System.out.println("Main Method Thread Name is : " + Thread.currentThread().getName());


        NumberPrinterThread numberPrinterThread = new NumberPrinterThread();
        numberPrinterThread.start();



        AlphabetPrinterThread alphabetPrinterThread = new AlphabetPrinterThread();
        alphabetPrinterThread.start();

        //thread.join();

        //thread 1(suhail) -> veg
        //thread 2(shukur) -> mutton
        //thread 3(imran) -> rice

        //thread1.join();
        //thread2.join();
        //thread3.join();
        //main thread(ishtaq) creates biryani



        numberPrinterThread.join();
        alphabetPrinterThread.join();
        System.out.println("Main Thread Ends...");
    }
}
