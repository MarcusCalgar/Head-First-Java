public class DailyAdviceTry {
	
	public static void main(String[] args){
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}
}