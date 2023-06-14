public class Main {
    //Задание 1
    //Создайте класс Car с полями:
    //brand;
    //horsePowers - сколько лошадиных сил;
    //boolean isElectric; - электрическая ли машина.
    //Внутри класса создайте конструктор и toString.
    //
    //Создайте еще один метод drive.
    //Метод должен выводить в консоль фразу "Zzzzz" - если машина электрическая, фразу "Brr-brr-brr", если машина не электрическая.
    //
    //Создайте несколько объектов-машин, вызовите метод drive.
    public static void main(String[] args) {
        Car car1 = new Car("Audi",240,false);
        Car car2 = new Car("BMW",340,true);
        Car car3 = new Car("Nissan",108,true);

        System.out.print(car1 + ": ");
        car1.drive();
        System.out.print(car2 + ": ");
        car2.drive();
        System.out.print(car3 + ": ");
        car3.drive();
    }
}