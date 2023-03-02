import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        //HESAP MAKİNESİ
        int number1,number2,secim,sonuc=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        number1=input.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        number2=input.nextInt();
        System.out.println("1.)Toplama\n2.)Çıkarma\n3.)Çarpma\n4.)Bölme");
        System.out.println("Seçiminiz:");
        secim=input.nextInt();
        switch (secim)
        {
            case 1:
                sonuc=number1+number2;
                System.out.println("Sonuç:" +sonuc);
              break;
            case 2:
                sonuc=number1-number2;
                System.out.println("Sonuç:"+sonuc);
                break;
            case 3:
                sonuc=number1*number2;
                System.out.println("Sonuç:"+sonuc);
                break;
            case 4:
                sonuc=number1+number2;
                System.out.println("Sonuç:"+sonuc);
                break;

            default:
                System.out.println("Lütfen Geçerli bir değer giriiniz:");
        }

    }
}
