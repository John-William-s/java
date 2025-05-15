import java.util.*;
class Employee2 
{
    Scanner sc=new Scanner(System.in);
    int empid;
    String name,address;
    double salary;
    Employee2(int n)
    {
        System.out.println("Enter the employee id "+ n+": ");
        empid=sc.nextInt();
        System.out.println("Enter the name of employee"+ n+": ");
        name=sc.next();
        System.out.println("Enter the address of employee"+ n+": ");
        address=sc.next();
        System.out.println("Enter the salary of employee"+ n+": ");
        salary=sc.nextDouble();
    }
    
}

class Teacher extends Employee2
{
    Scanner sc= new Scanner(System.in);
    String dept,subject[];
    int no;
    Teacher(int x)
    {
        super(x);
        System.out.println("Enter the department : ");
        dept=sc.next();
        System.out.println("enter the no of subjects");
        no=sc.nextInt();
        subject=new String[no];
        System.out.println("enter the subjects");
        for(int i=0;i<no;i++)
        {
            subject[i]=sc.next();
        }
    
    }
     void display()
        {
            System.out.println("emp id is:"+empid);
            System.out.println("emp name is:"+name);
            System.out.println("emp address is:"+address);
            System.out.println("emp salary is:"+salary);
            System.out.println("emp department is:"+dept);
            System.out.println("emp subject is:");
            for(int i=0;i<no;i++)
            {
                System.out.println(subject[i]);
            }
        }
}
public class new
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of teachers: ");
        int n = sc.nextInt();
        Teacher t[]=new Teacher[n];
        for(int i=0;i<n;i++){
            t[i]=new Teacher(i+1);

        }
        for(int i=0;i<n;i++){
            t[i].display();
        }

        
    }
}


        

    
    

