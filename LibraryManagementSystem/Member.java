package LibraryManagementSystem;

public class Member {
	int memberId;
	String name;
	Book borrowedBook1 =null;
	Book borrowedBook2 = null;
	
	public Member(int memberId, String name)
	{
		this.memberId = memberId;
		this.name = name;
	}
	
	public boolean borrowBook(Book book)
	{
		if(book.isAvailable)
		{
			if(borrowedBook1 == null)
			{
				borrowedBook1 = book;
				book.markAsIssued();
				return true;
			}
			else if(borrowedBook2 == null)
			{
				borrowedBook2 = book;
				book.markAsIssued();
				return true;
			}			
		}
		return false;
	}
	
	public boolean returnBook(Book book)
	{
		if(borrowedBook1 == book)
		{
			borrowedBook1 = null;
			book.markAsAvailable();
			return true;
		}
		else if(borrowedBook2 == book)
		{
			borrowedBook2 = null;
			book.markAsAvailable();
			return true;
		}
		return false;
	}
	
	public String getMemberDetails()
	{
		String details = ("MEMBER ID: "+memberId+", NAME: "+name+", BORROWED BOOKS: ");
		if(borrowedBook1 !=null) details +=borrowedBook1.title +" ";
		if(borrowedBook2 !=null) details +=borrowedBook2.title;
		return details;
	}
}
