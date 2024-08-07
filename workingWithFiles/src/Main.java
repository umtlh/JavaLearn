import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }
    public static void createFile(){
        File file =new File("D:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.1.3\\JavaProjects\\JavaLearn\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu");
            } else {
                System.out.println("Dosya Zaten Mevcut");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file= new File("D:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.1.3\\JavaProjects\\JavaLearn\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı: "+ file.getName());
            System.out.println("Dosya yolu: "+ file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi "+ file.canWrite());
            System.out.println("Dosya okunabilir mi "+ file.canRead());
            System.out.println("Dosya boyutu(byte): "+ file.length());
        }
    }
    public static void readFile(){
        File file= new File("D:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.1.3\\JavaProjects\\JavaLearn\\files\\students.txt");
        try {
            Scanner reader = new Scanner (file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

            }catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        }
        public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.1.3\\JavaProjects\\JavaLearn\\files\\students.txt",true));
            writer.newLine();
            writer.write("Talha");
            System.out.println("Dosyaya yazıldı.");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}