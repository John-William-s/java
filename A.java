class B {
    static int c;
    static void count(){
        c++;
    }
    static void display(){
        System.out.println("Count: " + c);
    }
}

class A{
    public static void main(String[] args) {
        B.c=0;
        B.display();
        B.count();
        B.display();
        B.count();
        B.count();
        B.display();
}
}
