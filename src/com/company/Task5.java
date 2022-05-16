package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task5 {
    public static void main(String []args) throws IOException {
        System.out.println("Enter the first three digits of your bank account");
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        String dig= BR.readLine();
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line;
            System.out.println("Searching ...");
            while((line= br.readLine())!=null){

                String[] str=line.split("\\t+");
                String BankNumberETMAN57120=str[0].trim();
                String BankNameETMAN57120=str[1].trim();
                if(BankNumberETMAN57120.equals(dig)){
                    System.out.println("Done ");
                    System.out.println("Bank Digits : " +BankNumberETMAN57120 + "\nBank Name : " +BankNameETMAN57120);
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("Data Loading Failed");
        }

    }
}