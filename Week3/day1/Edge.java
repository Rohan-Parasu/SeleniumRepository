package Week3.day1;

public class Edge extends Chrome 
{
	public void takeSnap() {
		System.out.println("takesnap");
	}
	public void clearCookies() {
		System.out.println("clearing cookies");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge edge = new Edge();
		edge.openURL();
		edge.closeBrowser();
		edge.navigateBback();
		edge.openIncognito();
		edge.clearCache();
		System.out.println(edge.browserName);
		System.out.println(edge.browserVersion);
		

	}

}
