class carclass{
    String brand;
    String model;
    int price;

    carclass(String brand,String model, int price){
        this.brand = brand;
        this.model=model;
        this.price=price;
    }

    void get_price(){
        System.out.println("The price of the car is: "+price);
    }

}

class second_hand extends carclass{

    second_hand(String brand, String model, int price) {
        super(brand, model, price);
    }
    void get_price(){
        System.out.println("The price of the car is: "+(price-100000));
    }
}

public class car {
    public static void main(String[] args) {
        second_hand c= new second_hand("bmw", "s-class", 200000);
        second_hand c1= new second_hand("audi", "A", 300000);
        System.out.println(c.brand);
        System.out.println(c1.brand);
        System.out.println(c.brand);
        c1.get_price(10);
    }
}
