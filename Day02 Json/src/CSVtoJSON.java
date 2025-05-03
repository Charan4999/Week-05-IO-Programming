package pack;
import org.json.CDL;
import org.json.JSONArray;
public class CSVtoJSON{
    public static void main(String[] args) {
        String csvData = """
            name,age,email
            fesDef,21,fsef@example.com
            sedv,20,sefse@example.com
        """;
        JSONArray jsonArray = CDL.toJSONArray(csvData);
        System.out.println(jsonArray.toString(2));
    }
}