import java.util.Scanner;
public class matrix {
    int[][] a;
    int m,n;

    matrix(int m, int n) 
    {
        a = new int[m][n];
        this.m = m;
        this.n = n;
    }
    public static void read(matrix a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements : ");
    for(int i=0;i<a.m;i++)
    {
        for(int j=0;j<a.n;j++)
            {
                System.out.print("element ["+i+"] ["+j+"]  :");
                a.a[i][j] = sc.nextInt();
            }
    }
    }
    public static void display(matrix a)
    {
        for(int i=0;i<a.m;i++)
        {
            for(int j=0;j<a.n;j++)
            {
                System.out.print(a.a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addition(matrix a,matrix b)
    {
        int c[][]=new int[a.m][a.n];
        for(int i=0;i<a.m;i++)
        {
            for(int j=0;j<a.n;j++)
            {
                c[i][j]=a.a[i][j]+b.a[i][j];
            }
        }
        System.out.println("addition of two matrices is:");
        for(int i=0;i<a.m;i++)
        {
            for(int j=0;j<a.n;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(matrix a)
    {
        int t[][]=new int[a.n][a.m];
        for(int i=0;i<a.m;i++)
        {
            for(int j=0;j<a.n;j++)
            {
                t[j][i]=a.a[i][j];
            }
        }
        System.out.println("transpose of matrix is:");
        for(int i=0;i<a.n;i++)
        {
            for(int j=0;j<a.m;j++)
            {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplication(matrix a,matrix b)
    {
        int c[][]=new int[a.m][b.n];
        for(int i=0;i<a.m;i++)
        {
            for(int j=0;j<b.n;j++)
            {
                for(int k=0;k<a.n;k++)
                {
                    c[i][j]=c[i][j]+a.a[i][k]*b.a[k][j];
                }
            }
        }
        System.out.println("multiplication of two matrices is:");
        for(int i=0;i<a.m;i++)
        {
            for(int j=0;j<b.n;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        matrix a = new matrix(2, 2);
        read(a);
        boolean flag=true;
        while(flag)
        {
            System.out.println("1.addition 2.Multiplication 3.Transpose 4.exit");
            Scanner scn = new Scanner(System.in);
            int choice = scn.nextInt();
            switch(choice)
            {
                case 1:
                    matrix b = new matrix(2, 2);
                    read(b);
                    addition(a,b);
                    break;
                case 2:
                    matrix d = new matrix(2, 2);
                    read(d);
                    multiplication(a,d);
                    break;
                case 3:
                    transpose(a);
                    break;
                case 4:
                    flag=false;
            }
        }

    }
}