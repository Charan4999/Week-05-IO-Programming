import java.io.*;
import java.util.Scanner;
public class SearchEmployee {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String filePath = "C:\\Users\\vcher\\IdeaProjects\\Week 5\\CSV\\Employee.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] column = line.split(",");
                if(column[1].equalsIgnoreCase(name)){
                    System.out.println("Department: "+column[2]+",Salary: "+column[3]);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
