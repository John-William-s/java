import java.util.*;
class objcircle{
    int r;
    void area(int r){
        double area=3.14*r*r;
        System.out.println("Area of circle is "+area);
    }
    public static void main(String[] args) {
        objcircle c1=new objcircle();
        c1.area(2);
    }
}