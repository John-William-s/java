public class string2 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abc");
        System.out.println(s);
        StringBuffer s1 = new StringBuffer("xyz");
        System.out.println(s +" " +s1);
        s1.append(s);
        System.out.println(s1);
        String s2 = new String("william");
        System.out.println(s2);
        s.insert(2,1);
        System.out.println(s);
        s.delete(2,3);
        System.out.println(s);
}
}
