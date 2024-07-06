package Week3.day1;

public class Chrome extends Browser
{
public void openIncognito() {
	System.out.println("open in the incognito mode");
}
public void clearCache() {
	System.out.println("Clear the browser cache");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome chrome =new Chrome();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBback();
		chrome.openIncognito();
		chrome.clearCache();
		System.out.println(chrome.browserName);
		System.out.println(chrome.browserVersion);

	}

}
