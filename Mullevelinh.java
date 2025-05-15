 class Mullevelinh {
    Mullevelinh()
    {
        System.out.println("Parent");
    }
    public static void main(String[] args)
    {
        grandchild o = new grandchild();
    }
}
class child extends Mullevelinh{
    child()
    {
        System.out.println("Child");
    }
}
class grandchild extends child{
    grandchild()
    {
        System.out.println("Grandchild");
    }

}
