public class Main {
    //Задание 1
    //Создайте класс велосипед - Bicycle - с полями:
    //
    //brand
    //numberOfSpeeds - количество передач
    //price - цена
    //Создайте в main несколько объектов класса велосипед. После создания: увеличьте стоимость первого велосипеда на 30%
    public static void main(String[] args) {
        Bicycle cube = new Bicycle("Cube",7,5300);
        cube.price = cube.price*1.3;
        System.out.println(cube.brand);
        System.out.println(cube.numberOfSpeeds);
        System.out.println(cube.price);


        Bicycle scott = new Bicycle("Scott",6,3200);
        System.out.println(scott.brand);
        System.out.println(scott.numberOfSpeeds);
        System.out.println(scott.price);

        Bicycle haibike = new Bicycle("Heibike",7,3000);
        System.out.println(haibike.brand);
        System.out.println(haibike.numberOfSpeeds);
        System.out.println(haibike.price);


        //Задание 2 *
        //Создайте массив из трех объектов класса велосипед.

        Bicycle[] array = new Bicycle[3];
        array[0] = new Bicycle("Cube",7,5300);
        array[1] = new Bicycle("Scott",6,3200);
        array[2] = new Bicycle("Heibike",7,3000);

    }


}