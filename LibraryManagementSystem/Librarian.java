package LibraryManagementSystem;

public class Librarian {
	int librarianId;
	String name;
	
	public Librarian(int librarianId, String name)
	{
		this.librarianId = librarianId;
		this.name = name;
	}
	public void addBook(Library library, Book newBook)
	{
		if(library.book1 == null)
		{
			library.book1 = newBook;
		}
		else if(library.book2 == null)
		{
			library.book2 = newBook;
		}
		else
		{
			System.out.println("Library is full. Cannot add more books!!");
			return;
		}
		System.out.println("Book added successfully!" + newBook.getBookDetails());
	}
	
	public void viewMembers(Library library)
	{
		System.out.println("Library Members");
		if(library.member1 !=null)
		{
			System.out.println(library.member1.getMemberDetails());
		}
		if(library.member2 !=null)
		{
			System.out.println(library.member2.getMemberDetails());
		}
		
	}
}
