package javabasics.singleton;

public class PrinterLazyInstantiationThreadSafe {
    String name;
    String model;
    String printString;

    private static PrinterLazyInstantiationThreadSafe printer;

    private PrinterLazyInstantiationThreadSafe(){

    }

    public static PrinterLazyInstantiationThreadSafe getPrinterInstance(){
        //2nd thread waiting..
        synchronized (PrinterLazyInstantiationThreadSafe.class){
            //1threaad
            if(printer == null){
                printer = new PrinterLazyInstantiationThreadSafe();
            }
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
