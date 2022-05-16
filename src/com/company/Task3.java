package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        int textint;
        try (FileInputStream temp=new FileInputStream("test1.txt");FileOutputStream fot = new FileOutputStream("ntest.txt")){
            do {
                textint = temp.read();
                if ((char)textint==' '){
                    textint='-';
                }
                if (textint != -1) {

                    fot.write(textint);
                }
            }
            while (textint != -1);
            System.out.println("Copied Succesfully");
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException f) {
            f.printStackTrace();
        }
    }
}