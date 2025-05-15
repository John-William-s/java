import java.util.*;
class Arraysort {
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
    System.out.println("sorted elements are : ");
    int max,temp;
    for(int i=0;i<size;i++){
        for(int j=0;j<size-1;j++){
            if(arr[j]<arr[j+1]){
                max=arr[j+1];
            }
            else{
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        
        }}
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
}
}

