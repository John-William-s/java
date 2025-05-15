import java.util.*;
import java.io.*;
class new_file{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the file name");
        String filename=sc.next();

        FileOutputStream fos=new FileOutputStream(filename);
        System.out.println("Enter text to insert");
        String txt=sc.next();
        fos.write(txt.getBytes());
        fos.close();

        FileInputStream fis=new FileInputStream(filename);
        byte[] b=new byte[fis.available()];
        fis.read(b);
        fis.close();

        String fileContent=new String(b);
        System.out.println("file name is :"+filename);

        System.out.println(fileContent);
 


        
    }
}