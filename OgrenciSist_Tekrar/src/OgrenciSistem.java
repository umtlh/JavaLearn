public class OgrenciSistem {
    // Öğrencinin ID'si, adı, soyadı, vize ve final notları için değişkenler tanımlıyoruz.
    int id;
    String ad;
    String soyad;
    int vize;
    int final2;

    // Yapıcı metot: Bu metot, yeni bir öğrenci nesnesi oluşturulduğunda çalışır ve verilen değerleri değişkenlere atar.
    public OgrenciSistem(int Id, String a, String s, int s1, int s2) {
        id = Id; // ID'yi atıyoruz
        ad = a; // Adı atıyoruz
        soyad = s; // Soyadı atıyoruz
        vize = s1; // Vize notunu atıyoruz
        final2 = s2; // Final notunu atıyoruz
    }

    // Ortalama hesaplama metodu: Vize ve final notlarının ortalamasını hesaplar.
    public double Ortalama() {
        return (vize + final2) / 2.0; // Ortalamayı hesaplıyoruz
    }

    // Yazdırma metodu: Öğrenci bilgilerini ekrana yazdırır.
    public void Yazdir() {
        System.out.println("Ad: " + ad); // Öğrencinin adını yazdırıyoruz
        System.out.println("Soyad: " + soyad); // Öğrencinin soyadını yazdırıyoruz
        System.out.println("Ortalama: " + Ortalama()); // Öğrencinin ortalamasını yazdırıyoruz
    }

    // Ana metot: Programın çalışmaya başladığı yer. Burada yeni bir öğrenci nesnesi oluşturuluyor ve bilgileri yazdırılıyor.
    public static void main(String[] args) {
        OgrenciSistem ogr = new OgrenciSistem(1, "umut", "celik", 75, 85); // Yeni bir öğrenci oluşturuyoruz
        ogr.Yazdir(); // Öğrenci bilgilerini yazdırıyoruz
    }
}
