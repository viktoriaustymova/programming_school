public class Main3 {
    public static void main(String[] args) {
        //Задание 4 (со звездочкой)
        //Имануил Кант любит считать свои шаги во время прогулки.
        //Прогулка его составляет 300 шагов.
        //Каждый шаг он считает в слух.
        //Но вместо чисел кратных 6
        // (это числа, которые делятся на 6 без остатка)
        // он говорит - "Himmel und Erde".
        //Вместо ста он заявляет "Sagen Sie mir,
        // kann man in Ihrem Land durch Null teilen?"
        //Выведите этот разговор Канта с самим собой в консоль.

        int steps = 1;
        while (steps<301) {
            if (steps == 100) {
                System.out.println("Sagen Sie mir, kann man in Ihrem Land durch Null teilen?");
            } else {
                System.out.println((steps%6==0)?"Himmel und Erde":steps);
            }
            steps++;
        }

    }
}
