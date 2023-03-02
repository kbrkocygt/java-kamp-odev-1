public class Main {
    public static void main(String[] args) {

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
        System.out.println("Bu sayı mevcuttur");
    }
    else
        System.out.println("Sayı mevcut değildir.");
    }
}