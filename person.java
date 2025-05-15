public class person {
    String name;
    int age;

    person(String name,int age)
    {
        this.name= name;
        this.age=age;
    }
    void display()
    {
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        // Creating an array of objects for the class personnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
        person p[]= new person[3];
        // intializing object
        p[0]= new person("Nandana", 20);
        p[1]= new person("Shibin",21);
        p[2]= new person("William",21);
        // Accesing objects in the array for{class name followed by obj name}
        // for(person p1:p)
        // {
        //     p1.display();
        // }
        for (int i=0;i<3;i++){
            p[i].display();
        }
    
    }
    
}
