package Week3.day1;

public class Safari extends Edge
{
	public void readerMode() {
		System.out.println("Readmode from Safari browser");
	}
	public void fullScreenMode() {
		System.out.println("Fullscreen mode in safari browser");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari safri =new Safari();
		safri.openURL();
		safri.closeBrowser();
		safri.navigateBback();
		safri.openIncognito();
		safri.clearCache();
		safri.readerMode();
		safri.fullScreenMode();
		System.out.println(safri.browserName);
		System.out.println(safri.browserVersion);

	}

}
