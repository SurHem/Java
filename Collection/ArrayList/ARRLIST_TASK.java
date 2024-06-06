
import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class RestaurantMenu {
    public ArrayList<MenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Burger", 149));
        menuItems.add(new MenuItem("Pizza", 399));
        menuItems.add(new MenuItem("Salad", 720));
        menuItems.add(new MenuItem("Pasta", 179));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}

class Order {
    private ArrayList<MenuItem> items;
    private ArrayList<Integer> quantity;

    public Order() {
        items = new ArrayList<>();
        quantity = new ArrayList<>();
    }

    public void addItem(MenuItem item , int quan) {
        items.add(item);
        quantity.add(quan);
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            int quan = quantity.get(i);
            MenuItem item = items.get(i);
            total += (item.getPrice()*quan);
        }

        // for (MenuItem menuItem : items) {
        //     total += menuItem.getPrice();
        // }
        return total;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public ArrayList<Integer> getQuantity(){
        return quantity;
    }
}

public class ARRLIST_TASK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestaurantMenu restaurantMenu = new RestaurantMenu();
        Order order = new Order();

        int choice;
        do {
            System.out.println("\n1. Display Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. View Order");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    displayMenu(restaurantMenu);
                    break;

                case 2:
                    addItemToOrder(sc, restaurantMenu, order);
                    break;
                
                case 3:
                    viewOrder(order);
                    break;
                    
                case 4:
                    System.out.println("Thank you for visiting. Have a nice day!");
                    break;
            
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        } while(choice != 4);
        sc.close();
    }

    private static void displayMenu(RestaurantMenu restaurantMenu) {
        System.out.println("\nMenu: ");
        ArrayList<MenuItem> menuItems = restaurantMenu.getMenuItems();
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i+1) + ". " + menuItem.getName() + " - Rs." + menuItem.getPrice());
        }
    }
    
    public static void addItemToOrder(Scanner sc, RestaurantMenu restaurantMenu, Order order) {
        displayMenu(restaurantMenu);
        System.out.print("\nEnter the number of the item to add your order: ");
        int itemNumber = sc.nextInt();
        System.out.println("Enter the quantity: ");
        int quan = sc.nextInt();
        ArrayList<MenuItem> menuItems = restaurantMenu.getMenuItems();
        if(itemNumber >= 1 && itemNumber <= menuItems.size() && quan > 0) {
            order.addItem(menuItems.get(itemNumber - 1),quan);
            System.out.println("Item added to your order.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void viewOrder(Order order) {
        System.out.println("\nYour Order: ");
        ArrayList<MenuItem> items = order.getItems();
        ArrayList<Integer> quantity = order.getQuantity();
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            int quan = quantity.get(i);
            System.out.println("-> " + item.getName() + ": Quantity:" + quan + " : Per. Rs." + item.getPrice());
        }
        // for(MenuItem item : items) {
        //     System.out.println("-> " + item.getName() + ": Rs." + item.getPrice());
        // }
        System.out.println("Total Cost: Rs." + order.calculateTotal());
    }
}
