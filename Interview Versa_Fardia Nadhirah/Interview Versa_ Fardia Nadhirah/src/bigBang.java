import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;

public class bigBang {
    public static void main(String[] args) {
        JSONArray bbarray = new JSONArray(); //declares and initialize array
        
        for (int i = 1; i <= 100; i++) {   //This loop will be show untill 100
            if (i % 3 == 0 && i % 5 == 0) {  // if the number is divisible by both 3 and 5 the output will show BIGBANG
                bbarray.add("BIGBANG");
            } else if (i % 3 == 0) {  //IF the number is divisible by 3 the output will show BIG 
                bbarray.add("BIG");
            } else if (i % 5 == 0) {  //If the number is divisible by 5 the output will show BANG 
                bbarray.add("BANG");
            } else {
                bbarray.add(Integer.toString(i));
            }
        }
        
        // Write the array to output.json file
        try (FileWriter file = new FileWriter("output.json")) {
            file.write(bbarray.toJSONString());
            System.out.println("Successfully generated array, find the output in 'output.json'.");
        } catch (IOException e) {
            System.out.println("oh, there is an error occurred while writing to 'output.json', try again!");
            e.printStackTrace();
        }
    }
}