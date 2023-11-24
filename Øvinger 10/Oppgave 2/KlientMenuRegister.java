//import java.util.Scanner;
//
//    public class KlientMenuRegister {
//        public static void main(String[] args) {
//
//            //    DISHES
//            Dish pizza1 = new Dish("Pizza", "Margherita Pizza", 149.90, "tomato, mozzarella, basil");
//            Dish pizza2 = new Dish("Pizza", "Pepperoni Pizza", 169.90, "tomato, pepperoni, cheese");
//            Dish pizza3 = new Dish("Pizza", "Vegetarian Pizza", 159.90, "tomato, bell peppers, olives, onions");
//            Dish pizza4 = new Dish("Pizza", "Hawaiian Pizza", 179.90, "tomato, ham, pineapple");
//            Dish pizza5 = new Dish("Pizza", "BBQ Chicken Pizza", 189.90, "BBQ sauce, chicken, red onions");
//
//            Dish appetizer1 = new Dish("Appetizer", "Garlic Knots", 69.90, "dough, garlic, butter");
//            Dish appetizer2 = new Dish("Appetizer", "Mozzarella Sticks", 99.90, "mozzarella, breadcrumbs");
//            Dish appetizer3 = new Dish("Appetizer", "Bruschetta", 79.90, "tomatoes, garlic, olive oil");
//            Dish appetizer4 = new Dish("Appetizer", "Spinach and Artichoke Dip", 109.90, "spinach, artichokes, cheese");
//            Dish appetizer5 = new Dish("Appetizer", "Buffalo Wings", 119.90, "chicken wings, buffalo sauce");
//
//            Dish dessert1 = new Dish("Dessert", "Tiramisu", 109.90, "ladyfingers, mascarpone, coffee");
//            Dish dessert2 = new Dish("Dessert", "Cheesecake", 89.90, "cream cheese, graham cracker crust");
//            Dish dessert3 = new Dish("Dessert", "Cannoli", 79.90, "cannoli shells, sweet ricotta filling");
//            Dish dessert4 = new Dish("Dessert", "Chocolate Lava Cake", 99.90, "chocolate, molten center");
//            Dish dessert5 = new Dish("Dessert", "Gelato", 89.90, "various gelato flavors");
//
////        MENU 1
//            Dish[] dishesMenu1 = {appetizer1, pizza1, dessert1};
////        MENU 2
//            Dish[] dishesMenu2 = {appetizer2, pizza2, dessert2};
////        MENU 3
//            Dish[] dishesMenu3 = {appetizer3, pizza3, dessert3};
////        MENU 4
//            Dish[] dishesMenu4 = {appetizer4, pizza4, dessert4};
////        MENU 5
//            Dish[] dishesMenu5 = {appetizer5, pizza5, dessert5};
//
//            Menu menu1 = new Menu(dishesMenu1, "Margherita pizza menu");
//            Menu menu2 = new Menu(dishesMenu2, "Pepperoni pizza menu");
//            Menu menu3 = new Menu(dishesMenu3, "Vegetarian pizza menu");
//            Menu menu4 = new Menu(dishesMenu4, "Hawaiian pizza menu");
//            Menu menu5 = new Menu(dishesMenu5, "BBQ Chicken pizza menu");
//
//            Menu[] menus = {menu1, menu2, menu3, menu4, menu5};
//
//            MenuRegister pizzaRistorante = new MenuRegister(menus);
//
////        Klient program
//            while (true) {
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.println("\n- MENU -");
//                System.out.println("[1] Find the number of menus registered");
//                System.out.println("[2] Find the number of dishes in a menu");
//                System.out.println("[3] Add a new menu");
//                System.out.println("[4] Add a dish to a menu");
//                System.out.println("[5] Print information about registered menus");
//                System.out.println("[6] Find a dish by name");
//                System.out.println("[7] Find dishes of a specific type");
//                System.out.println("[8] Exit Program");
//
//                int choice = scanner.nextInt();
//
//                if (choice == 1) {
//                    int numMenus = pizzaRistorante.getMenusAmount();
//                    System.out.println("There are " + numMenus + " menus registered.");
//                }
//
//                if (choice == 2) {
//                    Scanner readMenuName = new Scanner(System.in);
//                    System.out.print("Menu name: ");
//                    String menuName = readMenuName.nextLine();
//
//                    int numDishes = pizzaRistorante.amountDishesInMenu(menuName);
//                    System.out.println(menuName + " contains " + numDishes + " dishes.");
//                }
//
//                if (choice == 3) {
//                    Scanner readMenuInfo = new Scanner(System.in);
//                    System.out.print("Menu name: ");
//                    String menuName = readMenuInfo.nextLine();
//
//                    Menu newMenu = new Menu(new Dish[0], menuName);
//                    pizzaRistorante.addMenu(newMenu);
//                }
//
//                if (choice == 4) {
//                    Scanner readDishInfo = new Scanner(System.in);
//                    System.out.print("Menu name: ");
//                    String menuName = readDishInfo.nextLine();
//
//                    System.out.print("Enter dish details: ");
//                    System.out.println("Type: ");
//                    String type = readDishInfo.nextLine();
//
//                    System.out.println("Name: ");
//                    String name = readDishInfo.nextLine();
//
//                    System.out.println("Price: ");
//                    int price = readDishInfo.nextInt();
//
//                    System.out.println("Recipie: ");
//                    String recipie = readDishInfo.nextLine();
//
//                    Dish newDish = new Dish(type, name, price, recipie);
//                    pizzaRistorante.addDish(newDish, menuName);
//                }
//
//                if (choice == 5) {
//                    pizzaRistorante.printRegisterInfo();
//                }
//
//                if (choice == 6) {
//                    Scanner readDishName = new Scanner(System.in);
//                    System.out.print("Enter the name of the dish you want to find: ");
//                    String dishName = readDishName.nextLine();
//
//                    Dish foundDish = pizzaRistorante.findDishByName(dishName);
//
//                    if (foundDish != null) {
//                        System.out.println("Dish found: " + foundDish.getName());
//                    } else {
//                        System.out.println("Dish not found.");
//                    }
//                }
//                if (choice == 7) {
//                    Scanner readDishType = new Scanner(System.in);
//                    System.out.print("Enter the type of dishes you want to find: ");
//                    String dishType = readDishType.nextLine();
//
//                    Dish[] typeDishes = pizzaRistorante.findDishesOfType(dishType);
//
//                    if (typeDishes != null) {
//                        System.out.println("Dishes of type '" + dishType + "':");
//                        for (Dish dish : typeDishes) {
//                            System.out.println(dish.getName());
//                        }
//                    } else {
//                        System.out.println("No dishes of type '" + dishType + "' found.");
//                    }
//                }
//
//                if (choice == 8) {
//                    System.out.println("Exiting the program...");
//                    break;
//                }
//            }
//        }
//    }
//
