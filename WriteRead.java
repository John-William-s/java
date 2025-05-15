import java.io.*;
import java.util.*;
public class WriteRead {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String filename=sc.nextLine();
        FileOutputStream fos=new FileOutputStream(filename);
        System.out.println("enter the text to insert : ");
        String text=sc.nextLine();
        fos.write(text.getBytes());
        fos.close();
        FileInputStream fis=new FileInputStream(filename);
        byte[] b =new byte[fis.available()];
        fis.read(b);
        fis.close();
        String fileContent = new String(b);
        System.out.println("Contents of " +filename+" : ");
        System.out.println(fileContent);
        sc.close();
    }
}
