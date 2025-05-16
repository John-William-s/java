package graphics;
public class circle implements fig
{
double radius;
public circle(double r)
{
radius = r;
}
public void area()
{
System.out.println("Area of circle: " + String.format("%.2f" ,(3.14*radius*radius)));
}
}