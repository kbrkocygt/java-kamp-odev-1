import java.util.Scanner;
public class NotOrtHesap {
    public static void main(String[] args) {
     /*   //1. adım de ğişkenleri oluştur
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
*/


    /*
    //KDVm degeri hesaplama
     double tutar,kdvOran=0.18;
        Scanner input=new Scanner(System.in);
        System.out.print("Mal ya da hizmet bedeli:");
        tutar=input.nextInt();
        System.out.println(tutar);
        double kdvTutar=tutar*kdvOran;
        double kdvlitutar=tutar+kdvTutar;

        System.out.println("kdvsiz tutar:"+tutar);
        System.out.println("kdv oran : "+kdvOran);
        System.out.println("kdv tutarı: "+kdvTutar);
        System.out.println("Kdv li tutar:"+kdvlitutar);
        System.out.println(kdvlitutar);


     //Dik ucgen alanı bulma
     int a, b;
     double hipotenus;
     Scanner input=new Scanner(System.in);
        System.out.print("a kenarını giriniz:");
        a=input.nextInt();
        System.out.println("b kenarını giriniz:");
        b=input.nextInt();
        hipotenus= Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs: "+hipotenus);

        //Taksimetre hesaplama programı

        int taksiAcilis=10,minOdeme=20,maxOdeme;
        double kilometre=2.20,gidilecekKilometre;
        System.out.println("Taksimetre açıldı");
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç kilometre gideceksiniz:");
        gidilecekKilometre=input.nextDouble();

        double ucret=10 + (kilometre*gidilecekKilometre);

        if (ucret<minOdeme)
        {
            System.out.println("Lütfen daha uzun bir mesafe giriniz:");
        }
        else
            System.out.println("Ödenecek tutar:" + ucret);

 */

        double boy,kilo,bodyIndex;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
        boy=input.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        kilo=input.nextDouble();
        bodyIndex=kilo/(boy*boy);
        System.out.println("Vücut kitle indexiniz:"+bodyIndex);
    }
}
