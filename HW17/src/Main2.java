public class Main2 {
    public static void main(String[] args) {
        //Задание 2
        //Создайте массив из следующих элементов: "Dog", "Cat", "Monkey", "Snake".
        //Поменяйте местами значения между ячейкой под индексом 1 и ячейкой под индексом 3.

        String[] animals = {"Dog", "Cat", "Monkey", "Snake"};
        String temp = animals[1];
        animals[1] = animals[3];
        animals[3] = temp;
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
