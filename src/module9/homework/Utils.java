package module9.homework;


import module7.homework.task12345.Currency;
import module7.homework.task12345.Order;

import java.util.*;
import java.util.stream.Collectors;


public class Utils {

    // Sort list by Order price in decrease order
    public static List<Order> sortDecreasePrice(ArrayList<Order> order) {
        order.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
        System.out.println("Sorted list by Order price in decrease order\n" + order);
        return order;
    }

    // Sort list by Order price in increase order AND User city
    public static List<Order> sortIncreasePriceAndCity(ArrayList<Order> order) {
        order.sort((o1, o2) -> {
            if (o1.getPrice() == o2.getPrice())
                return (o1.getUser().getCity().compareTo(o2.getUser().getCity()));
            else return (o1.getPrice() - o2.getPrice());
        });
        System.out.println("\nSorted list by Order price in increase order AND User city\n" + order);
        return order;
    }

    // Sort list by Order itemName AND ShopIdentificator AND User city
    public static List<Order> sortNameAndShopIdentificatorAndCity(ArrayList<Order> order) {
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
    public static List<Order> deleteDuplicates(ArrayList<Order> order) {
        List<Order> orderTemp = order.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nDelete duplicates from the list\n" + orderTemp);
        return orderTemp;
    }

    // Delete items where price less than 1500
    public static List<Order> deleteLessOf1500(ArrayList<Order> order) {
        List<Order> orderTemp = order.stream()
                .filter(o -> o.getPrice() >= 1500)
                .collect(Collectors.toList());
        System.out.println("\nDelete items where price less than 1500\n" + orderTemp);
        return orderTemp;
    }

    // Separate list for two list - orders in USD and UAH
    public static List<Order> separateOrderByUSD(ArrayList<Order> order) {
        List<Order> orderListUSD = order.stream()
                .filter(o -> o.getCurrency() == Currency.USD)
                .collect(Collectors.toList());
        System.out.println("\nSeparate list of USD\n" + orderListUSD);
        return orderListUSD;
    }

    public static List<Order> separateOrderByUAH(ArrayList<Order> order) {
        List<Order> orderListUAH = order.stream()
                .filter(o -> o.getCurrency() == Currency.UAH)
                .collect(Collectors.toList());
        System.out.println("\nSeparate list of UAH\n" + orderListUAH);
        return orderListUAH;
    }

    // Separate list for as many lists as many unique cities are in User
    public static Map<String, List<Order>> separateListByUniqueCities(ArrayList<Order> order) {
        Map<String, List<Order>> cities = order.stream()
                .collect(Collectors.groupingBy(o -> o.getUser().getCity()));

        Map<String, List<Order>> separatedListsByUniqueCities = new TreeMap<>(cities);

        System.out.println("\nSeparate list for as many lists as many unique cities are in User\n" +
                separatedListsByUniqueCities);
        return separatedListsByUniqueCities;
    }

    // Check if set contain Order where User's lastName is - 'Petrov'
    public static List<Order> separateOrderByLastName(ArrayList<Order> order, String lastName) {
        List<Order> orderContainsLastName = order.stream()
                .filter(o -> o.getUser().getLastName().equals(lastName))
                .collect(Collectors.toList());
        System.out.println("\nCheck if set contain Order where User's lastName is - 'Petrov'\n" + orderContainsLastName);
        return orderContainsLastName;
    }

    // Delete orders where currency is USD
    public static List<Order> deleteOrderUSD(ArrayList<Order> order) {
        List<Order> orderUSD = order.stream()
                .filter(o -> o.getCurrency() != Currency.USD)
                .collect(Collectors.toList());
        System.out.println("\nDelete orders where currency is USD\n" + orderUSD);
        return orderUSD;
    }

}




