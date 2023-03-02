import  java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        String userName,Password;
        int balance=2000 , right=3,select;
        while (right>0)
        {
            Scanner input=new Scanner(System.in);
            System.out.print("Kullanıcı Adınız:");
            userName=input.nextLine();
            System.out.println("Parolanız:");
            Password=input.nextLine();
            if (userName.equals("Patika") && Password.equals("123"))
            {
                System.out.print("Merhaba ATM 'ye Hoşgeldiniz");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                System.out.println("1.Para Çekme\n2.Bakiye Sorgulama\n3.Para Yatırma\nÇıkış yap");
                select=input.nextInt();
                if (select==1)
                {
                    System.out.println("Ne kadar Çekmek istiyorsunuz?");
                     int  price=input.nextInt();
                    if (price>balance)
                    {
                        System.out.println("Bakiye  yetersiz");
                    }
                    else {
                        balance-=price;
                    }
                }
                else if(select==2)
                {
                    System.out.println("Hesabınızda şuan da " +balance);
                }
                else if(select==3)
                {
                    System.out.print("Yatırmak istediğiniz tutar:");
                    int price=input.nextInt();
                    balance+=price;

                }
                while (select!=4);

                    System.out.println("Tekrar görüşmek üzere");

                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz");
            }
            if (right==0)
            {
                System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz");
            }
            else {
                System.out.println("Kalan  hakkınız:" +right);
            }
        }

    }
}
