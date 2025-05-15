public class nandana {
    int l,b;
    nandana(int a,int c)
    {
        l=a;
        b=c;
    }
    void area(){
        System.out.println("Area of rectangle is :"+l*b);

    }
    
}
class child extends nandana{
    int h;
    child (int m, int n,int z)
    {
        super(m,n);
        h=z;
        System.out.println(h);
    }
    void volume()
    {
        System.out.println("Volume of cuboid is :"+l*h*b);
    }

    public static void main(String[] args)
    {
        child c = new child(2,3,4);
        c.area();
        c.volume();
    }
}
