public class Main {
//    public static void add (int a, int b ){
//        System.out.println("Toplamları:  "+(a+b));
//    }
//    public static void main (String []args)
//        add(10,20);
//public static int add(int a, int b ){
//   // System.out.println("Toplamları:  "+(a+b));
//    return (a+b);
//}
//    public static void main (String []args) {
//        int total =add (10,20)+ add(40,20);
//        System.out.println("Total: "+total);
    //Method Overloading
//public static int add(int a, int b, int c ){
//    return (a+b);
//}
//public static int add(int a, int b ){
//    return (a+b);
//
//}
//public static void main (String []args){
//System.out.println("Toplamları:  "+(add(10,20,30)));
    public static void main (String[] args){
        // Obje Oluşturma1
    Employee employee = new Employee (2, "Umut Talha","umtlh@hotmail.com");
    Employee employee2 = new Employee (3, "Umut2","umut2@hotmail.com");
    Employee employee3 = new Employee(0,"Bilgi Yok","Bilgi Yok");
//    System.out.println("Employee 1 Name:" + employee.name);
    employee.showInfos();
    employee2.showInfos();
    employee3.showInfos();
    }
}