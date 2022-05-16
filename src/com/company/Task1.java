package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        FileInputStream te;
        int var;
        try{
            te=new FileInputStream("test123.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        try{
            do{
                var=te.read();
                if (var!= -1){System.out.print((char)var);}
            }
            while(var!= -1);
        } catch (IOException f) {
            System.out.println("ERROR,In Reading The File");
        }
        finally {
            try{
                te.close();
                System.out.println("File Closed");
            }
            catch (IOException e) {
                System.out.println("ERROR,In Closing The File");
            }
        }

    }
}