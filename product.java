public class product {
    int productcode;
    String productName;
    int price;  

    product(int x,String y,int x1)
    {
        this.productcode=x;
        this.productName=y;
        this.price=x1;
    }
    public static void lowest(product p1,product p2,product p3)
    {
        if (p1.price<p2.price)
        {
            if (p1.price<p3.price)
            {
                System.out.println("The lowest price is "+p1.productName);
            }
        }
        else if(p2.price<p3.price)
        {
            System.out.println("The lowest price is "+p2.productName);
        }
        else
        {
            System.out.println("The lowest price is "+p3.productName);
        }
    }
    public static void main(String args[])
    {
        product p1 = new product(5,"pen",10);
        product p2 = new product(6,"pencil",5);
        product p3 = new product(7,"book",20);

        lowest(p1,p2,p3);

    }
}

