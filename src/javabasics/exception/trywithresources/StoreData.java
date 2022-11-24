package javabasics.exception.trywithresources;

public class StoreData {
    public static void main(String[] args) {
        // try without resource
//        try {
//            //step 1: establish connection to db
//            DatabaseConnection databaseConnection = new DatabaseConnection();
//
//            //step 2: perform db operations
//            //logic to store data in db
//
//            //step 3: close db connections
//            databaseConnection.close();
//        } catch (Exception e) {
//            System.out.println("Unknown exception occurred.");
//        }

        //try with resource
        //step 1: establish connection to db
        try(DatabaseConnection databaseConnection = new DatabaseConnection();) {
            //step 2: perform db operations
            //logic to store data in db

            //step 3: close db connections. This step will be automatically taken care in try with resources
        }

        //Note: try without catch and finally is possible only when we use try with resources

    }
}
