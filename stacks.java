import java.util.*;
class stacks{
    int size,top=-1;
    ArrayList<Integer> stack;
    stacks(int s){
        size=s;
        stack= new ArrayList<Integer>(s);
    }
    void push(){
        Scanner sc=new Scanner(System.in);
        if(top+1>=size){
            System.out.println("Stack Overflow");
        }else{
            top++;
            System.out.println("Enter the element to insert");
            int ele=sc.nextInt();
            stack.add(ele);  
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("underflow");
        }else{
            
            stack.remove(top);
            top--;
        }
    }
    void display(){
        System.out.println(stack);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("enter the size");
        int s=sc.nextInt();
        stacks st=new stacks(s);
        while(true){
            System.out.println("Enter the choice 1.push 2.pop 3.Display");
            ch = sc.nextInt();
        switch(ch){
            case 1:st.push();
                    break;
            case 2:st.pop();
                   break;
            case 3:st.display();
                   break;
            case 4:return;
            default:System.out.println("error");
    }
}
    }
}