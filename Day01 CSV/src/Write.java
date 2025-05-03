import java.util.*;
import java.io.*;
public class Write {
    public static void main(String[] args){
        String filePath = "C:\\Users\\vcher\\IdeaProjects\\Week 5\\CSV\\Write.csv";

        try(BufferedWriter br = new BufferedWriter(new FileWriter(filePath))){
            br.write("101,dcsafe,32,98");
            br.newLine();
            br.write("102,aacfea,23,78");
            br.newLine();
            System.out.println("Successfully Written");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
