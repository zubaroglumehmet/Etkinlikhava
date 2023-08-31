import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner etkinlik = new Scanner(System.in);
        int sicaklik;
        String result;
        System.out.print("Sıcaklık giriniz:");
        sicaklik = etkinlik.nextInt();
        result= (sicaklik<5) ? "Kayağa Gidiniz." : "Diğer etkinliklere göz atınız.";
        System.out.println(result);
        if (sicaklik >= 25){
            System.out.println("Yüzmeye gidebilirsin");
        }else if(sicaklik >= 10){
            System.out.println("Piknige gidebilirsin");
        }else if(sicaklik35>=5) {
            System.out.println("Sinemaya gidebilirsin");
        }
    }
}