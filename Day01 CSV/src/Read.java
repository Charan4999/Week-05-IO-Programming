import java.io.*;
import java.util.*;
public class Read {
    public static void main(String[] args){
        String filePath = "C:\\Users\\vcher\\IdeaProjects\\Week 5\\CSV\\Student.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line =br.readLine())!=null){
                String[] columns = line.split(",");
                System.out.println("ID : "+ columns[0]+",Name : "+columns[1]+",Age : "+columns[2]+",Marks : "+columns[3]);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
