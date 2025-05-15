import java.util.*;
class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of elements:");
    int size=sc.nextInt();
    int arr[]=new int [size];
    System.out.println("enter the elements:");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("the elements are : ");
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("len:"+arr.length);
}
}
