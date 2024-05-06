// Java programının başlangıcı
public class Main {

    // Ana metot (main method)
    public static void main(String[] args) {
        // topla2 metodu çağrılıyor ve sonuç "toplam" değişkenine atanıyor
        int toplam = topla2(2, 3, 4, 5);

        // Sonucu ekrana yazdırma
        System.out.println(toplam);
    }

    // Toplama işlemi yapan metot
    public static int topla2(int ...sayilar){
        int toplam = 0; // Toplam değeri sıfırla

        // Her bir sayıyı toplama ekle
        for (int sayi : sayilar) {
            toplam += sayi;
        }

        // Toplamı döndür
        return toplam;
    }
}
