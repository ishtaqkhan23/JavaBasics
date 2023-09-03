package javabasics.singleton;

public class PrinterLazyInstantiation {
    String name;
    String model;
    String printString;
    private static PrinterLazyInstantiation printer;

    private PrinterLazyInstantiation(){

    }

    public static PrinterLazyInstantiation getPrinterInstance() {
        if (printer == null) {
            printer = new PrinterLazyInstantiation();
        }
        return printer;
    }

    public String getPrintString() {
        return printString;
    }

    public void setPrintString(String printString) {
        this.printString = printString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void print(){
        System.out.println("printing...");
        System.out.println(this.printString);
    }
}
