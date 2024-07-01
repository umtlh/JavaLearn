import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList <Customer>();
        customers.add(new Customer(1, "Umut","Celik"));
        Customer ugur = new Customer(2, "Ugur","Celik");
        customers.add(ugur);
        customers.add(new Customer(3, "Esra","Celik"));
        customers.remove(ugur);
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}