package LibraryManagementSystem;

import java.util.Scanner;

public class MainClassOfLibraryManagementSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Library library=new Library();
		Librarian librarian=new Librarian(1,"John");
		
		library.book1 = new Book(101,"Java Programming","Author A");
		library.book2 = new Book(102,"Data Structures","Author B");
		library.member1 = new Member(1,"Alice");
		library.member2 = new Member(2,"Bob");
		
		boolean exit = false;
		
		while(!exit)
		{
			System.out.println("\n----------------------------------------------------");
			System.out.println("\t\tWELCOME TO LIBRARY MANAGEMENT SYSTEM");
			System.out.println("----------------------------------------------------");
			System.out.println("Following functionalites are available:");
			System.out.println("1 - View Library Details");
			System.out.println("2 - Borrow Book");
			System.out.println("3 - Return Book");
			System.out.println("4 - Librarian Portal");
			System.out.println("5 - Exit");
			System.out.println("-----------------------------------------------------");
			
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			
			switch(choice)
			{
			case 1: //View Library details
					System.out.println("\nLibrary Details");
					System.out.println("***************");
					if(library.book1 !=null)
					{
						System.out.println(library.book1.getBookDetails());
					}
					if(library.book2 !=null)
					{
						System.out.println(library.book2.getBookDetails());
					}
					break;
					
			case 2: //Borrow book
					System.out.print("\nEnter Member ID (1 for Alice, 2 for Bob)");
					int memberId = scan.nextInt();
					System.out.print("Enter Book ID (101 or 102): ");
					int bookId = scan.nextInt();
					
					Member borrowingMember = (memberId ==1) ? library.member1 :library.member2;
					Book borrowingBook = (bookId ==101) ? library.book1 : library.book2;
					
					if(borrowingMember.borrowBook(borrowingBook))
					{
						System.out.println("Book borrowed successfully!");
					}
					else {
						System.out.println("Cannot borrow book. Either it's unavailable or you reached the borrowing limit!");
					}
					break;
					
			case 3: //Return book
					System.out.print("\nEnter Member ID (1 for Alice, 2 for Bob): ");
					memberId =scan.nextInt();
					System.out.print("Enter Book ID (101 or 102): ");
					bookId = scan.nextInt();
					
					Member returningMember = (memberId == 1)? library.member1 : library.member2;
					Book returningBook = (bookId == 101) ? library.book1 : library.book2;
					
					if(returningMember.returnBook(returningBook))
					{
						System.out.println("Book returned successfully");
					}
					else
					{
						System.out.println("Cannot return book. Either it's unavailable or you reached the borrowing limit!");
					}
					break;
					
			case 4: //Librarian portal
					System.out.println("\n-----------------------------------------------");
					System.out.println("\t\tWelcome to Librarian Portal");
					System.out.println("-----------------------------------------------");
					System.out.println("1. Add Books");
					System.out.println("2. View Members");
					System.out.println("3. Exit Portal");
					System.out.println("-----------------------------------------------");
					System.out.print("Enter your choice: ");
					int adminChoice = scan.nextInt();
					
					switch(adminChoice)
					{
						case 1: 
								System.out.print("\nEnter Book ID: ");
								int newBookId = scan.nextInt();
								scan.nextLine();
								System.out.print("Enter Book Title: ");
								String newBookTitle = scan.nextLine();
								System.out.print("Enter Book Author: ");
								String newBookAuthor = scan.nextLine();
								
								Book newBook = new Book(newBookId, newBookTitle, newBookAuthor);
								librarian.addBook(library, newBook);
								break;
								
						case 2: 
								librarian.viewMembers(library);
								break;
								
						case 3: 
								System.out.println("Exiting librarian Portal....");
								break;
						
						default: System.out.println("Invalid choice!!!!");
					}
					break;
					
			case 5: //Exit
					System.out.println("\nExiting the Library Management System!!!");
					exit = true;
					break;
					
			default: System.out.println("\nInvalid choice!!! Try again...");
			}
		}
		
		scan.close();
	}
}
