interface stuff{
    public String getname();
    public double getprice();
}



class Trio implements stuff{

    private sandwich sandwich;
    private salad salad;
    private drink drink;

    public Trio(sandwich sandwich, salad salad, drink drink){
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    @Override
    public String getname() {
        String result = new String("");
        result = sandwich.getname() + "/" + salad.getname() + "/" + drink.getname() + " Trio";
        return result;
    }

    @Override
    public double getprice() {
        double totalPrice = 0;
        double lowestPrice = 0;
        totalPrice += sandwich.getprice();
        totalPrice += salad.getprice();
        totalPrice += drink.getprice();

        if((sandwich.getprice()<salad.getprice()) && (sandwich.getprice()<drink.getprice())){
            lowestPrice = sandwich.getprice();
        }
        if((salad.getprice()< sandwich.getprice()) && (salad.getprice()<drink.getprice())){
            lowestPrice = salad.getprice();
        }
        if((drink.getprice()<salad.getprice()) && (drink.getprice()<sandwich.getprice())){
            lowestPrice = drink.getprice();
        }

        totalPrice -= lowestPrice;
        return totalPrice;
    }

}

class sandwich implements stuff{
    String name;
    double price;

    public sandwich(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String getname() {
        //TODO:
        return name;
    }

    @Override
    public double getprice() {
        //TODO:
        return price;
    }
}

class salad implements stuff{
    String name;
    double price;

    public salad(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String getname() {
        //TODO:
        return name;
    }

    @Override
    public double getprice() {
        //TODO:
        return price;
    }
}

class drink implements stuff{
    String name;
    double price;

    public drink(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String getname() {
        //TODO:
        return name;
    }

    @Override
    public double getprice() {
        //TODO:
        return price;
    }
}

//class Main{
//
//    public static void main(String[] args) {
//        sandwich mySandwich = new sandwich("Subway Steak and Cheese", 10);
//        salad mySalad = new salad("Caesar Salad", 1.80);
//        drink myDrink = new drink("Coke", 1.90);
//        Trio myTrio = new Trio(mySandwich, mySalad, myDrink);
//        System.out.print(myTrio.getprice());
//    }
//
//}
