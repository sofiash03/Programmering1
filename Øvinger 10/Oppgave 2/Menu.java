class Menu {
    private Dish[] dishes;
    private String name;

    public Menu(Dish[] dishes, String name) {
        this.dishes = dishes;
        this.name = name;
    }
    public Dish[] getDishes() {
        return dishes;
    }

    public String getName() {
        return name;
    }

    public Dish doFindDishByName(String find_name) {
        Dish dish_name = null;

        for (int i = 0; i < dishes.length; i++) {
            if (dishes[i].getName().equals(find_name)) { //går gjennom alle rettene sammenlikner navnet med navnet til retten vi ønsker å finne
                dish_name = dishes[i];      //lagrer retten i en variabel
            }
        }
        return dish_name;   //returnerer den lagrede retten
    }

    public void doAddDish(Dish dish) {
        Dish[] updated_menu = new Dish[dishes.length + 1];  //opretter en lengre liste

        for (int i = 0; i < dishes.length; i++) {
            updated_menu[i] = dishes[i];        //legger inn alle tidligere retter
        }

        updated_menu[dishes.length] = dish;     //legger inn den nye retten
        this.dishes = updated_menu;             //oppdaterer variablen
    }

    public Dish[] doFindDishesByType(String find_type) {
        Dish[] dish_type = new Dish[dishes.length];
        int amount = 0;

        for (int i = 0; i < dishes.length; i++) {       // ser hvor mange retter av den typen som er i lista
            if (dishes[i].getType().equals(find_type)) {
                dish_type[i] = dishes[i];       //lagrer rettene av riktig type i en liste
                amount += 1;
            }
        }
        int h = 0;
        Dish[] final_dishes = new Dish[amount];

        for (int i = 0; i < dishes.length; i++) {   //fjerner nullrom
            if (dish_type[i] != null) {
                final_dishes[h] = dish_type[i];
                h ++;
            }
        }
        return final_dishes;
    }

    public String menuInfo() {
        String info = name.toUpperCase();
        for (int i = 0; i < dishes.length; i++) {
            info += "\n" + dishes[i].dishInfo();
        }
        return info;
    }

    public float totalPrice() {
        float total = 0;
        for(Dish dish : dishes){        //legger prisen til hver enkel rett sammen for en total pris for menyen
            total += dish.getPrice();
        }
        return total;
    }
}

