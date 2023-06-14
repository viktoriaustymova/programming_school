public class Main {
    /*
    1 Написать метод, который возвращает ИНДЕКС максимального элемента в массиве

    2 Написать метод, который возвращает ИНДЕКС минимального элемента в массиве

     */


    public static void main(String[] args) {
        int [] numbers = {3,7,12,5,25};
        System.out.println("Индекс максимального элемента в массиве {3,7,12,5,25}: " + getMaxIndex(numbers));
        System.out.println("Индекс минимального элемента в массиве {3,7,12,5,25}: " + getMinIndex(numbers));
    }

    public static int getMaxIndex(int [] array){
       int maxIndex = 0;
       int maxValue = array[0];
       for (int i = 1;i< array.length;i++) {
           if (array[i] > maxValue) {
               maxValue = array[i];
               maxIndex = i;
           }
       }
       return maxIndex;
    }

    public static int getMinIndex (int [] array){
        int minIndex = 0;
        int minValue = array[0];
        for (int i = 1; i < array.length;i++){
            if (array[i]<minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}


