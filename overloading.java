import java.util.*;
class overloading {
    void area(int r)
    {
        double carea = 3.14*r*r; 
        System.out.println("area of circle is "+carea);

    }
    void area(int l,int b)
    {
        int carea = l*b;
        System.out.println("area of rectangle is "+carea);
    }
    public static void main(String[] args) {
        overloading circle = new overloading();
        circle.area(2,3);
    }
}
