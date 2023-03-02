import java.util.Scanner;

public class NotOrtHesaplayanPrg {
    public static void main(String[] args) {
        //1. adım de ğişkenleri oluştur
        int turk,mat, fizik,muzik,kimya,tarih,toplam;
        //scanner sınıfımızı tamamaladık
        Scanner input=new Scanner(System.in);
        System.out.println("**********************Not Ortalaması Hesaplayan Program**********************");

        System.out.print("Türkçe Notunuzu Giriniz:");
        turk=input.nextInt();

        System.out.println("Mat Notunuz:");
        mat=input.nextInt();

        System.out.println("Muzik notunuz:");
        muzik=input.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=input.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya=input.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih=input.nextInt();

        toplam=(turk+mat+muzik+kimya+tarih);
        double sonuc=toplam/6.0;
        System.out.println("Not ortalaması:" + sonuc);
    }
}
