package hust.soict.globalict.garbage;

import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 


public class GarbageCreator {
    public static void main(String[] args) {
        try{
            File inputFile = new File("OtherProject\\src\\hust\\soict\\globalict\\garbage\\input.txt");
            Scanner sc = new Scanner(inputFile);
            long start = System.currentTimeMillis();
            String outputStringBuilder = "";
            start = System.currentTimeMillis();
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                outputStringBuilder += (data);
            }
            System.out.println(System.currentTimeMillis() - start);
        } catch (FileNotFoundException e){
            System.out.println("An error orcurred");
            e.printStackTrace();
        }
    }
}
