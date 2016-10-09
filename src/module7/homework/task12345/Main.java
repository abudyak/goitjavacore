package module7.homework.task12345;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
         * Create Main class where you create 10 Orders with 10 Users and put it to the List
         *
         * - sort list by Order price in decrease order
         * - sort list by Order price in increase order AND User city
         * - sort list by Order itemName AND ShopIdentificator AND User city
         *
         * - delete duplicates from the list
         * - delete items where price less than 1500
         * - separate list for two list - orders in USD and UAH
         * - separate list for as many lists as many unique cities are in User
         */

        // Creating 10 Orders witn 10 Users
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(0, 500, Currency.USD, "Order1", "Karavan", (new User(100, "Bob", "Marley", "New York", 1000))));
        orders.add(new Order(1, 100, Currency.UAH, "Order2", "Shipito", (new User(101, "Jhon", "Dow", "San Francisco", 3000))));
        orders.add(new Order(2, 125, Currency.USD, "Order3", "Karavan", (new User(102, "John", "Lewis", "Washington", 500))));
        orders.add(new Order(3, 50, Currency.UAH, "Order4", "Robby From Boston", (new User(103, "Charlie", "Sheen", "Boston", 1000))));
        orders.add(new Order(4, 1000, Currency.USD, "Order5", "Karavan", (new User(104, "Tom", "Hanks", "Minneapolis", 5000))));

        orders.add(new Order(5, 230, Currency.UAH, "Order6", "Karavan", (new User(105, "Will", "Smith", "Chicago", 1500))));
        orders.add(new Order(6, 370, Currency.UAH, "Order7", "Shinola and Willys", (new User(106, "Morgan", "Freeman", "Los Angeles", 2000))));
        orders.add(new Order(7, 199, Currency.USD, "Order8", "Kinfolk", (new User(107, "Brad", "Pitt", "Detroit", 7000))));
        orders.add(new Order(8, 125, Currency.USD, "Order9", "Indigo & Cotton", (new User(108, "Scarlett", "Johansson", "Kansas City", 9000))));
        orders.add(new Order(9, 199, Currency.USD, "Order10", "Baldwin", (new User(109, "Anne", "Hathaway", "Brooklyn", 3500))));

        // Sorting list by Order price in decrease order
        Comparator<Order> increasePrice = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };
        orders.sort(increasePrice);
        System.out.println(orders);

        // Sorting list by Order price in increase order AND User city
        Comparator<Order> decreasePrice = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice()) return (o1.getUser().getCity().compareTo(o2.getUser().getCity()));
                        else return (o1.getPrice() - o2.getPrice());
            }
        };
        orders.sort(decreasePrice);
        System.out.println(orders);
    }
}
