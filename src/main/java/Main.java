
import org.json.JSONObject;
import com.tivit.centrifugo.credentials.Token;
import com.tivit.centrifugo.credentials.User;
import com.tivit.centrifugo.listener.ConnectionListener;
import com.tivit.centrifugo.listener.DataMessageListener;
import com.tivit.centrifugo.message.DataMessage;
import com.tivit.centrifugo.subscription.SubscriptionRequest;
import com.tivit.centrifugo.Centrifugo;



public class Main {

	static String centrifugoAddress = "wss://stage.hub.tivit.com.br/connection/websocket";
	static String userId = "4";
	static String userToken = "6d72fcd9-db86-4dd2-a6d9-5030fe7de582"; //nullable
	static String token = "09fe11a9983d2992e6197d365b943e8007462bf4a49972b67db5a34fbfa74608";
	static String tokenTimestamp = "1507299411";
	static Centrifugo centrifugo = new Centrifugo.Builder(centrifugoAddress)
	                        .setUser(new User(userId, userToken))
	                        .setToken(new Token(token, tokenTimestamp))
	                        .build();
	
	static String channel = "ChannelTest";
	
	
	public static void main(String[] args) {
		
		centrifugo.connect();
		centrifugo.subscribe(new SubscriptionRequest (channel));
		
		centrifugo.setDataMessageListener(new DataMessageListener() {
	        @Override
	        public void onNewDataMessage(final DataMessage message) {
	        	System.out.println( "Dados do canal " + message.getBody() );
	        }
		});
		
		centrifugo.setConnectionListener(new ConnectionListener() {

	        @Override
	        public void onWebSocketOpen() {
	        	System.out.println("Web Socket Open");
	        }

	        @Override
	        public void onConnected() {
	        	 System.out.println("Conectado");
	        	 
	        	 
	             JSONObject data = new JSONObject();
	             data.put("content_1", "value_1");
	             data.put("content_2", 2);
	        	    	
	        	//centrifugo.sendMessage( channel ,  data );
	             centrifugo.sendMessage( channel ,  "{\"content_1\":value_1,\"content_2\":2}" );
	        }

	        @Override
	        public void onDisconnected(final int code, final String reason, final boolean remote) {
	        	System.out.println( "Desconectado " + reason );	
	        }
		});	
	}
	
	
}
