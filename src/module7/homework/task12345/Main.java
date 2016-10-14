package module7.homework.task12345;


import java.util.*;

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

        // Creating 10 Orders with 10 Users and putting them to the List
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

        // Preparing data as TreeSet for further using in task:
        // "Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet.
        // You should create 8 unique and two duplicated Orders ..."
        Set<Order> ordersTreeSet = new TreeSet<>(orders);

        // Sorting list by Order price in decrease order
        Comparator<Order> increasePrice = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };
        orders.sort(increasePrice);
        System.out.println("Sorted list by Order price in decrease order");
        System.out.println(orders);

        // Sorting list by Order price in increase order AND User city
        Comparator<Order> decreasePriceAndCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice())
                    return (o1.getUser().getCity().compareTo(o2.getUser().getCity()));
                else return (o1.getPrice() - o2.getPrice());
            }
        };
        orders.sort(decreasePriceAndCity);
        System.out.println("\nSorted list by Order price in increase order AND User city");
        System.out.println(orders);

        // List Sorting by Order itemName AND ShopIdentificator AND User city
        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().equals(o2.getItemName())) {
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                }
                if (o1.getShopIdentificator().equals(o2.getShopIdentificator())) {
                    return (o1.getUser().getCity().compareTo(o2.getUser().getCity()));
                }
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });
        System.out.println("\nSorted list by Order itemName AND ShopIdentificator AND User city");
        System.out.println(orders);

        // Deleting of duplicates from the list
        Set<Order> dublicateFree = new HashSet<>(orders);
        System.out.println("\nDeleting duplicates from the list");
        System.out.println(dublicateFree);

        // Deleting of items where price less than 1500
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getPrice() < 1500) iterator.remove();
        }
        System.out.println("\nDeleted items where price less than 1500");
        System.out.println(orders);

        // List separating for two list - orders in USD and UAH
        List<Order> ordersUSD = new ArrayList<>();
        List<Order> ordersUAH = new ArrayList<>();
        Iterator<Order> iter = orders.iterator();

        while (iter.hasNext()) {
            Order order = iter.next();
            if (order.getCurrency().equals(Currency.USD)) {
                ordersUSD.add(order);
            }
            if (order.getCurrency().equals(Currency.UAH)) {
                ordersUAH.add(order);
            }
        }
        System.out.println("\nSeparate list of USD:");
        System.out.println(ordersUSD);

        System.out.println("\nSeparate list of UAH:");
        System.out.println(ordersUAH);


        // List separates for as many lists as many unique cities are in User
        List<String> cities = new ArrayList<>();
        ArrayList<ArrayList<Order>> orderListsByCity = new ArrayList<>();
        for (Order ord : orders) {
            if (!cities.contains(ord.getUser().getCity())) {
                cities.add(ord.getUser().getCity());

                ArrayList<Order> orderListTemp = new ArrayList<>();
                orderListTemp.add(ord);
                orderListsByCity.add(orderListTemp);
            }
        }
        System.out.println("\nOrders separating for as many lists as many unique cities are in User");
        System.out.println(orderListsByCity);


        /**
         * Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet. You should create 8 unique and two duplicated Orders
         *
         * - check if set contain Order where User’s lastName is - “Petrov”
         * - print Order with largest price using only one set method - get
         * - delete orders where currency is USD using Iterator
         */

        System.out.println("\nPrepared TreeSet set is");
        System.out.println(ordersTreeSet);

        // Check if set contains Order where User’s lastName is - “Petrov”
        String str = "Petrov";
        Iterator<Order> iteratorTree = ordersTreeSet.iterator();
        while (iteratorTree.hasNext()) {
            Order orderNext = iteratorTree.next();
            if (orderNext.getUser().getLastName().equals(str)) {
                System.out.println("\n" + orderNext + "contains " + str);
            }
        }

        // Print Order with largest price using only one set method - get
        // Question 1: What is the set method - get? It seems there is no get method in set
        Iterator<Order> iteratorTree2 = ordersTreeSet.iterator();
        Order maxPriceOrder = iteratorTree2.next();
        while (iteratorTree2.hasNext()) {
            Order orderNext = iteratorTree2.next();

            if (orderNext.getPrice() > maxPriceOrder.getPrice()) {
                maxPriceOrder = orderNext;
            }
        }
        System.out.println("\nOrders with largest price\n" + maxPriceOrder);

        // Delete orders where currency is USD using Iterator
        Iterator<Order> iteratorTree3 = ordersTreeSet.iterator();
        while (iteratorTree3.hasNext()) {
            Order orderNext = iteratorTree3.next();
            if (orderNext.getCurrency().equals(Currency.USD)) {
                iteratorTree3.remove();
            }
        }
        System.out.println("\nOrders with USD currency only\n" + ordersTreeSet);

    }
}
