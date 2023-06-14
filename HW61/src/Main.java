import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        //Создайте класс товар Product с полями:
        //название
        //рейтинг
        //цена
        //категория
        //Создайте лист из 10 товаров с разными значениями

        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple Iphone 14 Pro 128 GB",4.7,1159,"Smartphones"));
        products.add(new Product("Apple Iphone 14 Pro 256 GB",4.8,1289,"Smartphones"));
        products.add(new Product("Apple Iphone 12 128 GB",4.5,782,"Smartphones"));
        products.add(new Product("Samsung Galaxy A23 64GB",4.6,249,"Smartphones"));
        products.add(new Product("Samsung Galaxy Tab A8",4.1,215,"Tablets"));
        products.add(new Product("Lenovo Tab M10",3.9,119,"Tablets"));
        products.add(new Product("Apple Ipad Air",4.9,729,"Tablets"));
        products.add(new Product("INF 311 Small Digital Camera",3.1,69,"Cameras"));
        products.add(new Product("Sony Cyber-Shot DCS-RX 199",4.5,500,"Cameras"));
        System.out.println(products);


        //Задание 1
        // Получите лист товаров, которые стоят дороже 200 евро.

        List<Product> productsFilteredByPrice =
                products.stream().
                        filter(product -> product.getPrice()> 200).
                        toList();
        System.out.println(productsFilteredByPrice);

        //Задание 2
        //Получите лист товаров, отсортированных по рейтингу
        List<Product> productsSortedByRating = products.stream().
                sorted(Product::compareTo).
                toList();
        System.out.println(productsSortedByRating);

        //Задание 3
        //Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
        boolean isIphoneXR = products.stream().
                anyMatch(product -> product.getTitle()
                        .equals("Iphone XR"));
        System.out.println(isIphoneXR);


        //Задание 4 map
        //Создайте новый лист товаров на основании старого,
        // пусть в новом листе рейтинг будет увеличен на 1. Товары в исходном листе не должны измениться.
        List<Product> productsWithNewRating =
                products.stream()
                        .map(product ->
                                new Product(product.getTitle(),
                                        product.getRating()+1, product.getPrice(),product.getCategory()))
                        .toList();
        System.out.println(productsWithNewRating);

        //Задание 5 forEach
        //Измените цену товаров в исходном листе товаров:
        // увеличьте ее на 20 евро. Товары в исходном листе должны измениться.
        products.forEach((product)-> product.setPrice(product.getPrice()+ 20));
        System.out.println(products);


        //Задание 6 reduce
        //Посчитайте общую стоимость всех товаров в листе.
        Double totalPrice = products.stream().map(Product::getPrice).
                reduce(0.0,Double::sum);

        System.out.println(totalPrice);




















    }
}