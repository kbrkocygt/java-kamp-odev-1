 class Car {
    //nitelikler degiskenler ile belirlenir.
    String type;
    String model;
    String color;
    int speed;
    int speedLimit=180;

    Car ()
    {
        System.out.println("Nesne olusturuldu");
    }


    //davranıslar
    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

     int decreaseSpeed(int decrease) {
         if (speed > 0) {
             speed -= decrease;
         }
         return speed;
     }

     void printSpeed() {
         System.out.println("Speed : " + speed);
     }
     // ...
}
