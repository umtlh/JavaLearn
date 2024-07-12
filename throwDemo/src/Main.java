public class Main {
    public static void main(String[] args) {
        AccountManager  manager = new AccountManager();
        System.out.println("Hesap= "+ manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap= "+ manager.getBalance());
        try {
            manager.withdraw(40);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hesap= "+ manager.getBalance());
    }
}