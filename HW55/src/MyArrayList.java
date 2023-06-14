public class MyArrayList<T> {
    private static final int DEFAULT_SIZE = 10;

    private T[] elements;

    private int count;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.count = 0;
    }

    public void add(T element){
        if (count == elements.length){
            throw new IllegalArgumentException("Превышение размеров списка");
        }
        this.elements[count] = element;
        count++;

    }
    public T get(int index){
        if(index>=0 && index <count){
            return this.elements[index];
        } else {
            throw new IndexOutOfBoundsException("Неверный индекс - " + index);
        }
    }
}
