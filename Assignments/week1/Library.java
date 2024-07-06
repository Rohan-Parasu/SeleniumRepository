package Assignments.week1;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println(bookTitle+" book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully  ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib =new Library();
		lib.addBook("The Secret Agent");
		lib.issueBook();

	}

}
