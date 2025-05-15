public class Meovr {
    int x,y;
    Meovr(int a,int b){
        x=a;
        y=b;
    }
    void display(){
        System.out.println("x = "+x+" y = "+y);
    }
    public static void main(String[] args) {
        child obj = new child(10,20,30);
        obj.display();
 }
}

class child extends Meovr {
    int z;
    child(int a,int b,int c){
        super(a,b);
        z=c;
        System.out.println("x : "+x+"y : "+y+"z : "+z);
}
void display()
{
    System.out.println("this is derived class");
}
}

