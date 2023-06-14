public class Main4 {
    /*
        Напишите метод, который возвращает самое большое число из заданного массива целых чисел.
        {15,9,1,30,5} -> 30
        {-15,6,1,0,-5} -> 6
         */
    public static void main(String[] args) {
        int[] array = {15,9,1,30,5};
        System.out.println(getMaxValue(array));

    }

    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0;i< array.length; i++ ) {
            if (array[i]>maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}
