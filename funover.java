public class funover {
    funover(int r)
    {
        System.out.println(3.14*r*r);
    }
    funover(int l, int b)
    {
        System.out.println(l*b);
    }
    public static void main(String[] args) {
        funover f1 = new funover(2);
        funover f2 = new funover(2,3);
    }
    
}
