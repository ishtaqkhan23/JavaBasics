package javabasics.singleton;

public class PrinterEagerInstantiation {
    String name;
    String model;
    String printString;

    private static PrinterEagerInstantiation printer = new PrinterEagerInstantiation();

    private PrinterEagerInstantiation(){

    }

    public static PrinterEagerInstantiation getPrinterInstance(){
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
