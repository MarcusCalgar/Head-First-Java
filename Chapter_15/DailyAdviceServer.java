import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.", "One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think", 
	"You might want to rethink that haircut."};
	
	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242); //Creates a serverSocket that listens for clients on port 4242
			
			while(true) {
				Socket sock = serverSock.accept(); // The server goes into an infinite loop where it waits for clients
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close(); // We're done with this particular client, so close the connections
				System.out.println(advice);
			}
	} catch (IOException ex) {
		ex.printStackTrace();
	}
	}
	
	private String getAdvice() {
		int random = (int) (Math.random() * adviceList. length);
		return adviceList[random];
	}
	
	private static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}

}

	