public class Main {
    public static void main(String[] args) {
      sayiBulmaca();
    }
    //java da metot isimleri camelCase yazılır.
    //Class isimleri PascalCase yazılır.
    public static  void sayiBulmaca()
    {
        int[] sayilar=new int []{1,2,3,4,5,7,9};
        int aranacak=11;
        boolean varMi=false;
        for (int sayi:sayilar)
        {
            if (sayi==aranacak)
                varMi=true;
            break;
        }
        if (varMi){
         mesajVer("Sayi mevcuttur:"+aranacak);
        }
        else
            mesajVer("Sayi mevcut değildir:"+aranacak);
    }


    public  static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}