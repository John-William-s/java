import java.util.Scanner;
public class stringfun {
    String s;
    Scanner sc=new Scanner(System.in);
    stringfun(){
System.out.println("enter string: ");
s=sc.next();
    }
    void fun(){
        System.out.println("Uppercase: "+s.toUpperCase());
           System.out.println("Lowercase: "+s.toLowerCase());
              System.out.println("Length: "+s.length());
                 System.out.println("Concatenate: "+s.concat("corn"));
                 System.out.println("substring(2): "+s.substring(2));
System.out.println("substring(2,6): "+s.substring(2,6));
System.out.println("trim: "+s.trim());
System.out.println("indexOf('o'): "+s.indexOf('o'));
System.out.println("indexOf('o',10): "+s.indexOf('o',10));
    }
    public static void main(String[] args) {
        stringfun n=new stringfun();
        n.fun();

    }
}

