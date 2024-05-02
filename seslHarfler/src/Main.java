public class Main {
    public static void main(String[] args) {
        char harf = 'Ü';

        switch (harf) {
            case 'A':
            case 'O':
            case 'U':
            case 'I':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");

        }
    }
}