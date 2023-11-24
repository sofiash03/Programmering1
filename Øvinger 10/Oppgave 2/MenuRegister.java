public class MenuRegister {
    private Menu[] menus;

    public MenuRegister(Menu[] menus) {
        this.menus = menus;
    }

    public Menu[] getMenus() {
        return menus;
    }

    public int getMenusAmount() {
        return menus.length;
    }

    public int getDishesAmount() {
        int amount = 0;
        for (Menu menu : menus) {
            amount += menu.getDishes().length;      //går gjennom alle menyene og finner totalen av antall retter
        }
        return amount;
    }

    public void addDish(Dish dish, String menu_name) {
        for(Menu menu : menus){
            if(menu.getName().equals(menu_name)){           //sammenlikner navnet til menyen med de allerede i systemet, derom den eksisterer legger den retten inn
                menu.doAddDish(dish);
            }
        }
    }

    public void addMenu(Menu menu) {
        Menu[] newListMenus = new Menu[menus.length + 1];       //oppretter liste som er et element lenger enn den orig.

        for (int i = 0; i < menus.length; i++) {
            newListMenus[i] = menus[i];                         // legger inn de eksisterende menyene
        }
        newListMenus[menus.length] = menu;                  //legger inn den siste menyen
        this.menus = newListMenus;                  // definerer listen med menyer som den nye lista

    }

    public Dish findDishByName(String name) {
        Dish dish_byName = null;

        for (Menu meny : menus) {                           // går gjennom alle menyene
            if (meny.doFindDishByName(name) != null) {      // om retten av den typen eksisterer i menyen så lagres den i var.
                dish_byName = meny.doFindDishByName(name);
            }
        }
        return dish_byName;
    }

    public Dish[] findDishesOfType(String type) {
        Dish[] dishesOfType = new Dish[getDishesAmount()];
        int h = 0;

        for (Menu meny : menus) {
            Dish[] dishes = meny.doFindDishesByType(type); //går gjennom alle menyene, alle rettene av typen lagres i en liste,
            for (Dish dish : dishes) {      // går gjennom alle rettene i lista, legger det inn i en ny samlet liste
                dishesOfType[h] = dish;
                h++;
            }
        }
        Dish[] finalList = new Dish[h];
        for (int i = 0; i < h; i++) {           //fjerner alle nullelementer
            finalList[i] = dishesOfType[i];
        }
        return finalList;
    }

    public String menuRegisterInfo() {
        String info = "";
        for (int i = 0; i < menus.length; i++) {
            info += "\n" + menus[i].menuInfo();
        }
        return info;
    }

    public Menu[] totalPriceBetween(float startPrice, float endPrice) {
        Menu[] filteredList = new Menu[menus.length];
        int h = 0;

        for(int i = 0; i < menus.length; i++){      //går gjennom alle menyene
            if(menus[i].totalPrice() > startPrice && menus[i].totalPrice() < endPrice){ //dersom menyens totalpris er melom a og b, vil den legges inn i en ny felles liste
                filteredList[h] = menus[i];
                h++;
            }
        }
        Menu[] finalList = new Menu[h]; //fjerner alle nullelementer
        for(int i = 0; i < h; i++){
            finalList[i] = filteredList[i];
        }
        return finalList;
    }
}



