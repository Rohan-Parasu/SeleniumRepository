package Week3.day1;

public class APIClient {
	public void sendRequest(String endpoint ) {
		System.out.println("Method with single argument "+endpoint);
	}
	public void sendRequest(String endpoint,String requestBody, boolean requestStatus ) {
		System.out.println("Method with multipe argument " +endpoint);
		System.out.println("request is "+requestBody);
		System.out.println("It true or false "+requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api =new APIClient();
		api.sendRequest("1");
		api.sendRequest("2", "200", true);

	}

}
