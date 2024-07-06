package Week3.day1;

public class LoginPage extends BasePage
{
	public void performCommonTasks() {
		System.out.println("method is overrided");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage login = new LoginPage();
		login.findElement();
		login.clickElement();
		login.enterText();
		login.performCommonTasks();

	}

}
