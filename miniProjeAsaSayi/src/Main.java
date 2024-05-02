public class Main {
    public static void main(String[] args) {
        // Sayı tanımlanıyor
        int number = 3;
        // Sayının asal olup olmadığını belirlemek için bir boolean değişkeni oluşturuluyor ve varsayılan olarak true atanıyor
        boolean isPrime = true;

        // Eğer sayı 1 ise
        if(number == 1) {
            // "Sayı 1'dir ve 1 asal değildir." mesajı yazdırılıyor
            System.out.println("Sayı 1'dir ve 1 asal değildir.");
            // Kodun devamını çalıştırmak için return kullanarak metoddan çıkılıyor
            return;
        }

        // 2'den başlayarak sayının kendisine kadar olan sayılarla kontrol edilmesi için bir döngü oluşturuluyor
        for (int i = 2; i < number; i++) {
            // Eğer sayı i'ye tam bölünüyorsa (yani asal değilse)
            if(number % i == 0) {
                // isPrime değişkeni false yapılıyor
                isPrime = false;
            }
        }

        // Eğer isPrime true ise
        if (isPrime) {
            // "Sayı asaldır" mesajı yazdırılıyor
            System.out.println("Sayı asaldır");
        } else {
            // Değilse, "Sayı asal değildir." mesajı yazdırılıyor
            System.out.println("Sayı asal değildir.");
        }
    }
}
