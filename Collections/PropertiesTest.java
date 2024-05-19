package Collections;


import java.util.*;
import java.io.*;
public class PropertiesTest {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\cbasw\\IdeaProjects\\Java\\src\\Collections\\abcproperties.txt");
        p.load(fis);
        System.out.println(p);

        String s = p.getProperty("user");
        System.out.println(s);

        p.setProperty("email","nag@gmail.com");
        System.out.println(p);

        System.out.println(p.setProperty("email","nag2@gmail.com"));
        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\cbasw\\IdeaProjects\\Java\\src\\Collections\\abcproperties.txt");

        p.store(fos,"Updated file");
    }
}
