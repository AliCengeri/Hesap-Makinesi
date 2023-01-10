import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1, a2, slct;
        System.out.print("İlk sayıyı giriniz: ");
        a1 = input.nextInt();
        System.out.print("İkinici sayıyı giriniz: ");
        a2 = input.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nHangi işlemi yapacağınızı seçiniz: ");
        slct = input.nextInt();

        switch (slct) {
            case 1 -> System.out.println(a1 + a2);
            case 2 -> System.out.println(a1 - a2);
            case 3 -> System.out.println(a1 * a2);
            case 4 -> {
                if (a2 == 0) {
                    System.out.println("hiçbir sayı 0'a bölünemez.");
                } else System.out.println(a1 / a2);
            }
        }
    }
}

