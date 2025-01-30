package LibraryManagementSystem;

public class Book {
	int bookId;
	String title;
	String author;
	boolean isAvailable;
	
	public Book(int bookId, String title, String author)
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	public String getBookDetails()
	{
		return "ID: "+bookId+", AUTHOR: "+author+", TITLE: "+title+", AVAILABLE:"+isAvailable;
		
	}
	
	public void markAsIssued()
	{
		isAvailable = false;
	}
	
	public void markAsAvailable()
	{
		isAvailable = true;
	}
}
