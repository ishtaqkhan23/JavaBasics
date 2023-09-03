package javabasics.singleton;

public class PrintDocument {
    public static void main(String[] args) {
        PrinterEagerInstantiation p = PrinterEagerInstantiation.getPrinterInstance() ;
        p.setPrintString("abcdefgh");
        p.print();

        System.out.println(p);

        PrinterEagerInstantiation p1 = PrinterEagerInstantiation.getPrinterInstance();
        p1.setPrintString("ijklmnop");
        p1.print();
        System.out.println(p1);
    }
}
