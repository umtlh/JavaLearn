public class Employee {
    // Attribute, Field
    public int id;
    public String name;
    public String email;
    public Employee() {
        this.id = 0;
        this.name = "Bilgi Yok";
        this.email = "Bilgi Yok";
    }

    public Employee(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email= email;

    }
    public void showInfos () {
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Email : " + this.email);

    }
}
