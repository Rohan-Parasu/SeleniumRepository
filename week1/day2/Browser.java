package week1.day2;

public class Browser {
	public String launchbrowser(String Browsername) {
		System.out.println("Browser launched " +Browsername+" successfully");
		return Browsername;
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser url =new Browser();
		url.launchbrowser("Chrome");
		url.loadUrl();

	}
	
	

}
