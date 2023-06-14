import java.io.*;
import java.util.HashMap;
import java.util.List;

public class Main {

/*  1  Допустим, у нас есть магазин. В нашем магазине есть товары трех категорий:
продукты, электроника, одежда. У каждого товара есть цена, наименование категория к которой он относится.
 Важно, что после создания товара ни одно из его свойств не должно быть, доступно для изменения,
 т.е. все поля должны быть private. Создать список товаров



    2. Реализуйте в Main метод, который получает список товаров и формирует Map<String,Double>
    где ключ – наименование товара, значение – цена. Подсказка: видимо вам понадобятся гетеры.


    3. Реализовать в классе Товар возможность изменения цены.
    При этом система не должна давать возможность поставить отрицательную цену или 0
    Видимо, понадобится сеттер.
    **НЕОБЯЗАТЕЛЬНОЕ.Добавить возможность вести истории изменения цены у товара.*/

    public static void main(String[] args) throws IOException {

        List<Product> productList = readProductList();
        System.out.println(productList);

        HashMap<String,Double> productsMap = createMap(productList);
        System.out.println(productsMap);

    }

    public static List<Product> readProductList(){
        return List.of(
                new Product ("Молоко", 2.50, ProductCategory.FOOD),
                new Product("Кофе", 7.50, ProductCategory.FOOD),
                new Product("Яблочный сок",3,ProductCategory.FOOD),
                new Product("Джинсы", 35, ProductCategory.CLOTHES ),
                new Product("Футболка",15, ProductCategory.CLOTHES),
                new Product("Кофемашина",150,ProductCategory.ELECTRONICS),
                new Product("Ноутбук",800, ProductCategory.ELECTRONICS)
        );
    }

    public static HashMap<String,Double> createMap(List<Product> productList) {
        HashMap<String,Double> mapOfProducts = new HashMap<>();
        for (Product product: productList) {
            mapOfProducts.put(product.getName(), product.getPrice());
        }
        return mapOfProducts;
    }

}