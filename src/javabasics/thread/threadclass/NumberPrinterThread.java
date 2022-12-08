package javabasics.thread.threadclass;

public class NumberPrinterThread extends Thread {

    @Override
    public void run(){
        for (int i = 1; i<=26; i++){
            System.out.println("NumberPrinter Thread Name is : " + Thread.currentThread().getName());
            System.out.println("Printing Number : " + i);

        }
    }
}
