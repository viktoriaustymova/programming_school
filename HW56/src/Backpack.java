public class Backpack <T extends Book> {
    private String brand;
    public T content;

    public Backpack(String brand) {
        this.brand = brand;
    }

    public void addBook(T book){
        content = book;
    }


    @Override
    public String toString() {
        return "Backpack{" +
                "brand='" + brand + '\'' +
                ", content=" + content +
                '}';
    }
}
