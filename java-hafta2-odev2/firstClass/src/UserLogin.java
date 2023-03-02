import  java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String userName,password,cevap,newPassword;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adınız:");
        userName=input.nextLine();
        System.out.print("Şifreniz:");
        password=input.nextLine();



         if (userName.equals("patika") && password.equals("123"))
         {
             System.out.println("Giriş basarılı");
         }
         else {

             System.out.println("Kullanıcı adı veya şifre yanlış");
             System.out.println("Şifreyi sıfırlamak ister misiniz?");
             cevap=input.nextLine();
            if (cevap.equals("evet") || cevap.equals("Evet"))
            {
                System.out.println("Yeni şifre giriniz:");
                newPassword=input.nextLine();
                password.equals(newPassword);

                if (newPassword.equals("123"))
                {
                    System.out.println("Lütfen eski şifrenizden farklı bir şifre giriniz:");
                    System.out.println("Yeni şifre giriniz:");
                    newPassword=input.nextLine();
                    System.out.println("Şifreniz değiştirilmiştir");
                }
                else {
                    System.out.println("Şİfreniz değiştirilmişitr");
                }
            }
         }



    }
}
