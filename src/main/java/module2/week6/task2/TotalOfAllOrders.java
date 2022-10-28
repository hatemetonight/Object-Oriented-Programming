package main.java.module2.week6.task2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TotalOfAllOrders {
    public static void main(String[] args) {

        Customer customer1 = getCustomer(1L, "Maxim", 1);
        Customer customer2 = getCustomer(2L, "Andrew", 2);
        Customer customer3 = getCustomer(3L, "Inna", 3);

        Product product1 = getProduct(1L, "Guitar", "Guitars", 432432.0);
        Product product2 = getProduct(2L, "Drums", "Drums", 4324324.0);
        Product product3 = getProduct(3L, "Name3", "Name3", 123456.0);

        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        Order order1 = getOrder(products, 1L, LocalDate.of(2020, Month.FEBRUARY, 12),
                LocalDate.of(2020, Month.FEBRUARY, 14), "Ok", customer1);
        Order order2 = getOrder(products, 2L, LocalDate.of(2020, Month.FEBRUARY, 17),
                LocalDate.of(2020, Month.FEBRUARY, 27), "Ok", customer2);
        Order order3 = getOrder(products, 1L, LocalDate.of(2021, Month.FEBRUARY, 12),
                LocalDate.of(2020, Month.FEBRUARY, 14), "False", customer3);

        Order[] orderBase = {order1, order2, order3};

        double orderSumInFebruary = Arrays.stream(orderBase)
                .filter(order -> order.getStatus().equals("Ok"))
                .filter(order -> order.getOrderDate().getYear() == 2020)
                .filter(order -> order.getOrderDate().getMonth() == Month.FEBRUARY)
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();


        System.out.printf("Сумма заказа за февраль составляет: %s", orderSumInFebruary);
    }

    private static Customer getCustomer(long id, String name, int tier) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setTier(tier);
        return customer;
    }

    private static Order getOrder(Set<Product> products, long id, LocalDate orderDate,
                                  LocalDate deliveryDate, String status, Customer customer) {
        Order order = new Order();
        order.setProducts(products);
        order.setId(id);
        order.setOrderDate(orderDate);
        order.setDeliveryDate(deliveryDate);
        order.setStatus(status);
        order.setCustomer(customer);
        return order;
    }

    private static Product getProduct(long id, String name, String category, Double price) {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        return product;
    }
}