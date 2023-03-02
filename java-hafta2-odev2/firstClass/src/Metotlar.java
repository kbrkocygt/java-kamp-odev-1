import java.util.Scanner;

public class Metotlar {

//main metotu içinde kullanabılmemız ıcın static olmalı
      static    int power(int base,int exp)
    {
        int result= 1;
        for (int i=1; i<=exp; i++)
        {
            result*=base;
        }
       return  result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("üssü aınacak sayı: ");
        int base=input.nextInt();
        int exp=input.nextInt();
        int sonuc=  power(base,exp);
        System.out.println(sonuc);

    }
}
