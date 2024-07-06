package Week3.day1;

public class Browser {

	String browserName= "Chrome",browserVersion="12" ;
	 public void openURL() {
		 System.out.println("Browser is open with URL");
		
	 }
	 public void closeBrowser() {
		 System.out.println("closebrowser");
		 
	 }
	 public void navigateBback() {
		 System.out.println("navigate to back");
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBback();
		
	

	}

}
