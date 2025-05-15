import java.util.Scanner;

class Sort{
    int size;
    String s[];
    Scanner sc=new Scanner(System.in);
    Sort(){
        System.out.println("enter the number of strings : ");
        size=sc.nextInt();
        s=new String[size];
        System.out.println("enter "+size+" number of strings : ");
        for(int i=0;i<size;i++){
            s[i]=sc.next();
        }
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.println(s[i]+" ");
        }
    }
    void sort()
    {
        for(int i=0;i<size;i++)        
            for(int j=0;j<size-i-1;j++)
                if (s[j].compareTo(s[j+1])>0)
                {
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }                  
    }
}


public class SortString {
    public static void main(String[] args) {
        Sort s1=new Sort();
        System.out.println("Original string array : ");
        s1.display();
        s1.sort();
        System.out.println("Sorted string array : ");
        s1.display();
    }
}
