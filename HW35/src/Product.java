public class Product {
    private double price;
    private String name;
    private ProductCategory category;

    Product(String name, double price, ProductCategory category){
        this.price = price;
        this.name = name;
        this.category = category;
    }
    public String toString(){
        return "Товар:  " + name + ", цена: " + price + " евро"  + ", категория: " + category;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            this.price = price;
        }
    }
}
