public class Animal {
    String color="Blue";
}
class Animal2 extends Animal{
    String color = "Red";
    void color_display()
    {
        System.out.println(color);
        System.out.println(super.color);

    }
    public static void main(String[] args)
    {
        Animal2 ob = new Animal2();
        ob.color_display();
    }    
}
