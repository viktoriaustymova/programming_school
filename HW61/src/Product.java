public class Product {
    private String title;
    private double rating;
    private double price;
    private String category;

    public Product(String title, double rating, double price, String category) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }



    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public int compareTo(Product o2) {
        return Double.compare(rating,o2.rating);
    }
}
