import java.util.*;
class rectangle
{
    int l,b;
    void area(int l,int b)
    {
        int area=l*b;
        System.out.println("Area of rectangle is "+area);
    }
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.area(5, 6);

}
}