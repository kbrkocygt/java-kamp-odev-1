import java.util.Scanner;
public class CiftSayiBulma {
    public static void main(String[] args) {
        int sayi,toplam=0;
        double ort;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        sayi=input.nextInt();
        /*for (int i=0; i<sayi; i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
                i++;
            }
            else {
                System.out.println("Sayi çift değildir");
            }
        }
*/      int i;
        for ( i=0; i<sayi; i++)
        {
            if (i%3==0 || i%4==0)
            {
                System.out.println(i);
                i++;
                toplam+=i;
                ort= toplam/i;
                System.out.println(ort);
            }

        }


    }
}
