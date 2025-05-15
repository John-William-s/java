import java.util.Scanner;

public class complex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number");
        double r1=sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number");
        double i1=sc.nextDouble();
        System.out.println("Enter the real part of the second complex number");
        double r2=sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number");
        double i2=sc.nextDouble();
        double real = r1 + r2;
        double imaginary = i1 + i2;
        System.out.println("The sum of the two complex numbers is " + real + " + " + imaginary+"i" );
    }
}
