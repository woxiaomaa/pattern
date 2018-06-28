package adapt;

public class MyMain {
 
	public static void main(String[] args) {		
		GBSocketInterface gbSocket = new GBSocket();		
		SocketAdapter socketAdapter = new SocketAdapter(gbSocket);		
		Hotel hotel = new Hotel(socketAdapter);
		hotel.charge();
	}
}
