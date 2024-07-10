import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        BufferedReader reader = null;
        int total=0;
        try {
            reader = new BufferedReader(new FileReader("D:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.1.3\\JavaProjects\\JavaLearn\\readingFileDemo\\src\\deneme.txt"));
           String line =null;
           while (true) {
               try {
                   if (!((line =reader.readLine())!=null)) break;
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
               total += Integer.valueOf(line);
           }
           System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try
            {
                reader.close();
            }catch (Exception exception){
            }
        }
    }
        }
