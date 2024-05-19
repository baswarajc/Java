package Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.io.*;

public class PropertiesTest2 {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();

        FileInputStream fis = new FileInputStream("C:\\Users\\cbasw\\IdeaProjects\\Java\\src\\Collections\\dbconnection.txt");

        p.load(fis);

        System.out.println(p);

        String url = p.getProperty("url");
        String user = p.getProperty("user");
        String pwd = p.getProperty("pwd");
        Connection con = DriverManager.getConnection(url,user,pwd);

        ;;;;;;;;;;;;

    }
}


//