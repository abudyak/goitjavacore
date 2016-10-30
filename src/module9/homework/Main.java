package module9.homework;


import module7.homework.task12345.Currency;
import module7.homework.task12345.Order;
import module7.homework.task12345.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     User class structure from HW module 7 (User and Order) and complete tasks using Java 8 instruments

     - sort list by Order price in decrease order
     - sort list by Order price in increase order AND User city
     - sort list by Order itemName AND ShopIdentificator AND User city

     - delete duplicates from the list
     - delete items where price less than 1500
     - separate list for two list - orders in USD and UAH
     - separate list for as many lists as many unique cities are in User

     - check if set contain Order where User's lastName is - 'Petrov'
     - delete orders where currency is USD

     Restrictions:
     - you can't use iterator
     - you can't use loops

     Put every subtask to a separate method. Create Main class and test every method with test data.
     */

    // Creating 10 Orders with 10 Users and putting them to the List


    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(0, 500, Currency.USD, "Order01", "Karavan", (new User(100, "Bob", "Petrov", "New York", 1000))));
        orders.add(new Order(1, 2000, Currency.UAH, "Order02", "Shipito", (new User(101, "Jhon", "Dow", "Detroit", 3000))));
        orders.add(new Order(2, 125, Currency.USD, "Order03", "Karavan", (new User(102, "John", "Lewis", "Washington", 500))));
        orders.add(new Order(3, 50, Currency.UAH, "Order04", "Robby From Boston", (new User(103, "Petrov", "Petrov", "Boston", 1000))));
        orders.add(new Order(4, 1700, Currency.USD, "Order05", "Karavan", (new User(104, "Tom", "Hanks", "Minneapolis", 5000))));

        orders.add(new Order(5, 2300, Currency.UAH, "Order06", "Karavan", (new User(105, "Will", "Smith", "Chicago", 1500))));
        orders.add(new Order(6, 370, Currency.UAH, "Order09", "Shinola and Willys", (new User(106, "Morgan", "Freeman", "Los Angeles", 2000))));
        orders.add(new Order(6, 370, Currency.UAH, "Order09", "Shinola and Willys", (new User(106, "Morgan", "Freeman", "Los Angeles", 2000))));
        orders.add(new Order(7, 7000, Currency.USD, "Order08", "Kinfolk", (new User(107, "Brad", "Pitt", "Detroit", 7000))));
        orders.add(new Order(8, 125, Currency.USD, "Order07", "Indigo & Cotton", (new User(108, "Scarlett", "Johansson", "Kansas City", 9000))));

        // Sort list by Order price in decrease order
        Utils.sortDecreasePrice((ArrayList<Order>) orders);

        // Sort list by Order price in increase order AND User city
        Utils.sortIncreasePriceAndCity((ArrayList<Order>) orders);

        // Sort list by Order itemName AND ShopIdentificator AND User city
        Utils.sortNameAndShopIdentificatorAndCity((ArrayList<Order>) orders);



    }

}
