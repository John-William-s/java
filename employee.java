import java.util.*;
class employee{
    double eno,esalary;
    String ename;
    Scanner sc=new Scanner(System.in);
    employee(int k)
{
    System.out.println("Enter the name of the employee");
    ename=sc.next();
    System.out.println("Enter employee number");
    eno=sc.nextInt();
    System.out.println("Enter the salary ");
    esalary=sc.nextInt();
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of employees");
    int n=sc.nextInt();
    employee[] e=new employee[n];
    for(int i=0;i<n;i++){
        e[i]= new employee(i+1);
    }
    System.out.println("search an employee");
    int num=sc.nextInt();
    boolean flag=false;
    for(int i=0;i<n;i++){
       if(e[i].eno==num){
        System.out.println("employee  found"+e[i].ename+e[i].esalary);
        flag=true;
       }
       
       
    }
    if(!flag){
        System.out.println("employee not found");
    }

    
}

}

