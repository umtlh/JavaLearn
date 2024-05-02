public class Main {
    public static void main(String[] args) {
        // Sayı dizisi oluşturuluyor
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        // Aranacak sayı belirleniyor
        int aranacak = 3;
        // Sayının bulunup bulunmadığını kontrol etmek için bir boolean değişkeni oluşturuluyor
        boolean varMi = false;

        // Sayılar dizisi üzerinde dolaşılıyor
        for (int sayi : sayilar) {
            // Eğer aranan sayı bulunursa
            if (sayi == aranacak) {
                // varMi değişkeni true yapılıyor
                varMi = true;
                // Döngüden çıkılıyor
                break;
            }
        }
        // Eğer varMi değişkeni true ise
        if (varMi) {
            // Sayı mevcuttur mesajı yazdırılıyor
            System.out.println("Sayı Mevcuttur.");
        } else {
            // Değilse, sayı mevcut değildir mesajı yazdırılıyor
            System.out.println("Sayı Mevcut değildir.");
        }
    }
}
