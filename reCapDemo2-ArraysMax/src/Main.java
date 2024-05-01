public class Main {
    public static void main(String[] args) {
        double[] myList = {3.7,2.4,6.0,3.4};
        double total=0;
        double enbüyük = myList[0];
        for (double number:myList){
            if (enbüyük < number){
                enbüyük = number;
            }

            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam= " +total);
        System.out.println("En Büyük" +enbüyük);
    }
}