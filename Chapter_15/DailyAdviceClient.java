import java.io.*;
import java.net.*;

public class DailyAdviceClient {
	
	public void go() {
		try {
			Socket s = new Socket("127.0.0.1", 4242); // Create a socket connection to the server
			
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream()); // Create an InputStreamReader and chain it to the inputstream of the Socket
			BufferedReader reader = new BufferedReader(streamReader); // Chain the created InputStreamReader to the BufferedReader
			
			String advice = reader.readLine(); // Read a line from the BR and put it into a String
			System.out.println("Today you should: " + advice);
			
			reader.close(); // Closing the high level reader closes all the chained readers as well
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}

}
