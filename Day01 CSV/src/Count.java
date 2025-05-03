import java.util.*;
import java.io.*;
public class Count {
    public static void main(String[] args){
        String filePath = "C:\\Users\\vcher\\IdeaProjects\\Week 5\\CSV\\Student.csv";
        int count=0;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.readLine();
            String line;

            while((line = br.readLine())!=null){
                count++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Count : "+count);
    }
}
