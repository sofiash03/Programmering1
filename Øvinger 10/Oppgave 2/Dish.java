class Dish {
    private String type;
    private String name;
    private double price;
    private String recipie;

    public Dish(String type, String name, double price, String recipie){
        this.type = type;
        this.name = name;
        this.price = price;
        this.recipie = recipie;
    }

//    GET methods
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getRecipie(){
        return recipie;
    }
    public String dishInfo(){
        String info = "Name: " + name;
        info += "\n  type: " + type;
        info += "\n  price: " + price + "\n";

        return info;
    }

}
