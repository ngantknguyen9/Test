package getRequest;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class non_test {
	private static FileWriter file;
	public static void main(String[] args) {
		 
        // JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
        JSONObject obj = new JSONObject();
        obj.put("Name", "Crunchify.com");
        obj.put("Author", "App Shah");
 
        JSONArray company = new JSONArray();
        company.add("Company: Facebook");
        company.add("Company: PayPal");
        company.add("Company: Google");
        obj.put("Company List", company);
        try {
 
            // Constructs a FileWriter given a file name, using the platform's default charset
            file = new FileWriter("D:\\New folder\\crunchify.txt");
            file.write(obj.toJSONString());
            CrunchifyLog("Successfully Copied JSON Object to File...");
            CrunchifyLog("\nJSON Object: " + obj);
 
        } catch (IOException e) {
            e.printStackTrace();
 
        } finally {
 
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
 
    static public void CrunchifyLog(String str) {
        System.out.println("str");
    }
   
                           
    JSONParser jsonParser = new JSONParser();
    FileReader reader = new FileReader("\\D:");  
    Object obj = jsonParser.parse(reader);
    JSONArray usersList = (JSONArray) obj;
    System.out.println("Users List-> "+usersList); //This prints the entire json file
    
}

