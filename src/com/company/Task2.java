package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static  void main(String[] args) throws IOException {
        int var;
        try (FileInputStream tem=new FileInputStream("test1.txt"))
        {
            do{
                var=tem.read();
                if (var!= -1){System.out.print(var);}
            }
            while(var!= -1);
        }
        catch (FileNotFoundException f) {
            System.out.println("File not found");
            return;
        }
        catch (IOException e) {
            System.out.println("Error Reading The File");
        }

    }
}