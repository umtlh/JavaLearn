import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

        for (Object i:sayilar) {
            System.out.println(i);
        }

        }
}