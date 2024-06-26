public class Main {
    public static void main(String[] args) {
    CustomerManager customManager = new CustomerManager();
    customManager.databaseManager = new MySqlDatabaseManager()"";
    customManager.getCustomers();

    }
}