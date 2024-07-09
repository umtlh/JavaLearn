import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("D:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.1.3\\JavaProjects\\JavaLearn\\readingFileDemo\\src\\deneme.txt"));
        }catch (FileNotFoundException e) {
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