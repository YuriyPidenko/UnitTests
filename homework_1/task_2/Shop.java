package homework_1.task_2;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;



public class Shop {

    private List<Product> products;



    public Shop() {

        this.products = new ArrayList<>();

    }



    public void addProduct(Product product) {

        products.add(product);

    }



    public List<Product> getProducts() {

        return products;

    }



    public void sortProductsByPrice() {

        Collections.sort(products, (p1, p2) -> p1.getPrice() - p2.getPrice());

    }



    public Product getMostExpensiveProduct() {

        Product mostExpensiveProduct = null;

        for (Product product : products) {

            if (mostExpensiveProduct == null || product.getPrice() > mostExpensiveProduct.getPrice()) {

                mostExpensiveProduct = product;

            }

        }

        return mostExpensiveProduct;

    }

}



public class Product {

    private String name;

    private int price;



    public Product(String name, int price) {

        this.name = name;

        this.price = price;

    }



    public String getName() {

        return name;

    }



    public int getPrice() {

        return price;

    }

}



public class ShopTest {

    @Test

    public void testAddProduct() {

        Shop shop = new Shop();

        assertEquals(0, shop.getProducts().size());



        Product product1 = new Product("Product 1", 10);

        shop.addProduct(product1);

        assertEquals(1, shop.getProducts().size());

        assertEquals(product1, shop.getProducts().get(0));



        Product product2 = new Product("Product 2", 20);

        shop.addProduct(product2);

        assertEquals(2, shop.getProducts().size());

        assertEquals(product2, shop.getProducts().get(1));

    }



    @Test

    public void testSortProductsByPrice() {

        Shop shop = new Shop();

        Product product1 = new Product("Product 1", 30);

        shop.addProduct(product1);

        Product product2 = new Product("Product 2", 20);

        shop.addProduct(product2);

        Product product3 = new Product("Product 3", 10);

        shop.addProduct(product3);



        shop.sortProductsByPrice();



        assertEquals(product3, shop.getProducts().get(0));

        assertEquals(product2, shop.getProducts().get(1));

        assertEquals(product1, shop.getProducts().get(2));

    }



    @Test

    public void testGetMostExpensiveProduct() {

        Shop shop = new Shop();

        Product product1 = new Product("Product 1", 30);

        shop.addProduct(product1);

        Product product2 = new Product("Product 2", 20);

        shop.addProduct(product2);

        Product product3 = new Product("Product 3", 10);

        shop.addProduct(product3);



        Product mostExpensiveProduct = shop.getMostExpensiveProduct();



        assertEquals(product1, mostExpensiveProduct);

    }

}
