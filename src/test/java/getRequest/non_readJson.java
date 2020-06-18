package getRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class non_readJson {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser jsonParser = new JSONParser();
	    FileReader reader = new FileReader("D:\\New folder\\crunchify.txt");
	    //FileReader reader = new FileReader("D:\\New folder\\crunchify.txt");
	    Object obj = jsonParser.parse(reader);
	    JSONObject  usersList = (JSONObject ) obj;
	    JSONArray usersLists = (JSONArray) obj;
	    System.out.println("Users List-> "+usersList); //This prints the entire json file
	    System.out.println("Users List-> "+usersLists);
	    
	}

}
