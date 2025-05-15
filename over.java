import java.util.*;
class shape{
    void area(double r){
        System.out.println("area of circle is:"+3.14*r*r);
    }
    void area(int r){
        System.out.println("area of square is:"+r*r);
    }
    void area(int l,int h){
        System.out.println("area of rectangle is"+l*h);
    }
    void area(double b,double s){
        System.out.println("area of triangle is:"+.5*b*s);
    }
}
class over{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        shape s=new shape();
        System.out.println("Enter the radius of circle");
        double a=sc.nextDouble();
        s.area(a);
        System.out.println("Enter the side of square");
        int b=sc.nextInt();
        s.area(b);
        System.out.println("Enter length and breadth of the rectangle");
        int m=sc.nextInt();
        int n=sc.nextInt();
        s.area(m,n);
        System.out.println("Enter breadth and height of triangle");
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        s.area(c,d);

    }
}