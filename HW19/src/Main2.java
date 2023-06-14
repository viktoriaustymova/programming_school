public class Main2 {
    /*
     3 Написать метод, который создает копию исходного массива и в ней меняяет местами максимальный и
     минимальный элементы
     */
    public static void main(String[] args) {
        int [] numbers = {3,7,12,5,25};
        System.out.print("Исходный массив: ");
        printArray(numbers);
        int []  copy = getSwappedMinMaxClone(numbers);
        System.out.print("Измененная копия исходного массива ");
        printArray(copy);

    }

    public static int getMinValue(int [] array) {
        int minIndex = 0;
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex =i;
            }
        }
       return minIndex;
    }

    public static int getMaxValue(int [] array) {
        int maxIndex = 0;
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex =i;
            }
        }
        return maxIndex;
    }

    public static int[] getSwappedMinMaxClone(int[] arr) {
        // создали новый массив такой же длины со значениями по умолчанию
        int[] newArr = new int[arr.length];
        // теперь нужно заполнить массив, то есть скопировать значения из старого
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        int indexOfMin = getMinValue(newArr);
        int indexOfMax = getMaxValue(newArr);
        int temp = newArr[indexOfMin];
        newArr[indexOfMin] = newArr[indexOfMax];
        newArr[indexOfMax] = temp;
        return newArr;
    }

    public static void printArray(int [] array) {
            for (int i =0; i< array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
    }


}
