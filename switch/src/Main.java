public class Main {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Dereceniz İyi, geçtiniz.");
                break;
            case 'C':
            case 'D':
                System.out.println("Dereceniz Fena Değil, geçtiniz.");
                break;
            case 'F':
                System.out.println("Dereceniz Kötü, kaldınız.");
                break;
            default:
                System.out.println("Geçersiz Not girdiniz.");
        }
    }
}