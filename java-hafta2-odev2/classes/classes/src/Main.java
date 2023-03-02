public class Main {
    public static void main(String[] args) {
     //classlar refrans tiplerdir
     CustomerManager customerManager=new CustomerManager();
     CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;
     customerManager.Add();
     //Bellek => Stack and Heap
        //stack => CustomerManager customerManage cm,cm2  referansları tutar
        //heap=>new CustomerManager(); 101,102
        //Garbage collector heap de refransı olmayanı siler.

        //deger tipler
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);


        //diziler refrans tiptir
        int [] sayilar=new int[]{1,2,5};
        int [] sayilar2=new int[]{1,8,5};
        sayilar2=sayilar;
        sayilar[0]=10;
        System.out.println(sayilar2[0]);


    }
}
