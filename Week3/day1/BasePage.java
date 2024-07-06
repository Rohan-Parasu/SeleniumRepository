package Week3.day1;

public class BasePage {

	public void findElement() {
		System.out.println("element is founded");
	}
	public void clickElement() {
		System.out.println("element is clicked");
	}
	public void enterText() {
		System.out.println("Text is entered");
	}
	public void performCommonTasks() {
		System.out.println("Task have completed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage base= new BasePage();
		base.findElement();
		base.clickElement();
		base.enterText();
		base.performCommonTasks();

	}

}
