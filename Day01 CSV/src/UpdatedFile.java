import java.io.*;
public class UpdatedFile {
    public static void main(String[] args){
        String filePath = "C:\\Users\\vcher\\IdeaProjects\\Week 5\\CSV\\Employee.csv";
        String fresh = "C:\\Users\\vcher\\IdeaProjects\\Week 5\\CSV\\new_employee.csv";
        try(
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fresh))
                ){
            String line = br.readLine();
            bw.write(line);
            bw.newLine();
            while((line = br.readLine())!=null){
                String [] cols = line.split(",");
                if(cols[2].equalsIgnoreCase("IT")){
                    int sal = Integer.parseInt(cols[3]);
                    float new_sal = sal + (float)(sal*0.1);
                    cols[3]= String.format("%.0f", new_sal);
                }
                bw.write(String.join(",",cols));
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
