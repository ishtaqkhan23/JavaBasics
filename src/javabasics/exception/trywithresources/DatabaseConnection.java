package javabasics.exception.trywithresources;

public class DatabaseConnection implements AutoCloseable {

    String connection;

    public DatabaseConnection() {
        this.connection = "Established";
        System.out.println(this.connection);
    }

    @Override
    public void close() {
        this.connection = "Closed.";
        System.out.println(this.connection);
    }
}
