package com.company;
import java.io.*;

class DataManagement{
    String FullNameETMAN57120;
    void readDataETMAN57120() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter Your Full Name");
        FullNameETMAN57120=rd.readLine();
    }
    void WriteDataToFileETMAN57120(){
        try(FileWriter FW = new FileWriter("task4.txt")) {
            FW.write(FullNameETMAN57120);
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException f) {
            f.printStackTrace();
        }
    }
    void ReadDataFromFileETMAN57120(){
        String res;
        try(BufferedReader x = new BufferedReader(new FileReader("task4.txt"))) {
            while((res=x.readLine()) !=null){
                System.out.println(res);
            }
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException f) {
            f.printStackTrace();
        }
    }

}
public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataETMAN57120();
        obj.WriteDataToFileETMAN57120();
        System.out.println("-----------------");
        obj.ReadDataFromFileETMAN57120();
    }
}