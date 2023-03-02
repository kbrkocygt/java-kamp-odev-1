public class Main {
    public static void main(String[] args) {
      String mes="Bugün hava çok güzel";
      mes.substring(0,2);
      String yeniMesaj=mes.substring(0,2);
      yeniMesaj=sehir();
      int toplamm=topla(4,6);
      int topla2=topla(5,6,7);
        System.out.println("Sayi toplamı:"+toplamm);
        System.out.println(topla2);
        System.out.println(yeniMesaj);

    }
    //void method'u geriye bir değer döndürmez.! return olmaz!
    public  static  void ekle()
    {
        System.out.println("Eklendi");
    }
    public  static void sil()
    {
        System.out.println("Silindi");
    }
    public  static  void guncelle()
    {
        System.out.println("Güncellendi");
    }
    public  static int topla(int sayi1,int sayi2)
    {
        return  sayi1+sayi2;
    }
    public  static  int topla(int... sayilar)//variable arguments
    {int toplam=0;
      for(int sayi:sayilar)
          toplam+=sayi;
      return toplam;
    }
    public  static String sehir()
    {
        return "ankara";
    }
}