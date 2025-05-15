import java.util.*;
class Shape {
    void area(int r){
        System.out.println(3.14*r*r);
    }
    void area(int l,int b){
        System.out.println(l*b);
    }
    void triangle(int b,int h){
        System.out.println(0.5*b*h);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape circle = new Shape();
        System.out.println("enter the radius of circle :");
        int r=sc.nextInt();
        circle.area(r);

        
        Shape rectangle=new Shape();
        rectangle.area(5, 6);
    }
}

