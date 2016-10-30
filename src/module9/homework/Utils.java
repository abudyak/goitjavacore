package module9.homework;


import module7.homework.task12345.Order;

import java.util.ArrayList;


public class Utils {

    // Sort list by Order price in decrease order
    public static ArrayList<Order> sortDecreasePrice(ArrayList<Order> order) {
        order.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
        System.out.println("Sorted list by Order price in decrease order\n" + order);
        return order;
    }

    // Sort list by Order price in increase order AND User city
    public static ArrayList<Order> sortIncreasePriceAndCity(ArrayList<Order> order) {
        order.sort((o1, o2) -> {
            if (o1.getPrice() == o2.getPrice())
                return (o1.getUser().getCity().compareTo(o2.getUser().getCity()));
            else return (o1.getPrice() - o2.getPrice());
        });
        System.out.println("\nSorted list by Order price in increase order AND User city\n" + order);
        return order;
    }

    // Sort list by Order itemName AND ShopIdentificator AND User city
    public static ArrayList<Order> sortNameAndShopIdentificatorAndCity(ArrayList<Order> order) {
        order.sort((o1, o2) -> {
            if (o1.getItemName().equals(o2.getItemName())) {
                return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
            if (o1.getShopIdentificator().equals(o2.getShopIdentificator())) {
                return (o1.getUser().getCity().compareTo(o2.getUser().getCity()));
            }
            return o1.getItemName().compareTo(o2.getItemName());
        });
        System.out.println("\nSorted list by Order itemName AND ShopIdentificator AND User city\n" + order);
        return order;
    }

    // Delete duplicates from the list
    // TODO

}
