import java.util.*;
public class sort_string {
    String[] s;
    int n;
sort_string(){
     Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array");
   n=sc.nextInt();
  s=new String[n];
  for(int i=0;i<n;i++){
    s[i]=sc.next();
  }
}
  void sort(){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(s[j].compareTo(s[j+1])>0){
                String temp=s[j];
                s[j]=s[j+1];
                s[j+1]=temp;
            }
        }
        }
        }
         void display(){
            for(int i=0;i<n;i++)
            System.out.println(s[i]+" ");
            
    }  public static void main(String[] args){
            sort_string str=new sort_string();
            str.sort();
            System.out.println("the sorted array is:");
            str.display();
        }
    }


  

 

