import java.util.Scanner;
public class employee {
    int empno;
    String name;
    int salary;
    employee(int empno,String name,int salary)
    {
        this.empno=empno;
        this.name=name;
        this.salary=salary;
    }
    public static void search(employee[] emp, int temp, int n) {
        for (int i = 0; i < n; i++) {
            if (emp[i].empno == temp) {
                System.out.println(emp[i].empno + " " + emp[i].name + " " + emp[i].salary);
                return;  
            }
        }
        System.out.println("Employee with Emp no " + temp + " not found.");
    }
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entwer the size of the array: ");
        size=sc.nextInt();
        employee emp[]=new employee[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the employee number name and salary: ");
            emp[i]=new employee(sc.nextInt(),sc.next(),sc.nextInt());
        }

        for(int i=0;i<size;i++){
            System.out.println("Employee " +i+ " : "+emp[i].empno + " " + emp[i].name+" "+emp[i].salary);
        }
        System.out.println("Enter the Emp no to search : ");
        int num=sc.nextInt();
        search(emp,num,size);
        sc.close();
    } 
}
