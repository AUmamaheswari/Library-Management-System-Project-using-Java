package javaconcepts;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Library {


	private String bookName;
	private String authorName;
	private long edition;
	private int noOfCopies;
	private String journal;
	private int bookId;
	
	List<Library> Librarylist;

	//private String Status;
	public Library( ) {
	}
	//BookId
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int BookId) {
		this.bookId=BookId;
	}
	//BookName 
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String BookName) {
		this.bookName=BookName;
	}
	//AuthorName
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String AuthorName) {
		this.authorName=AuthorName;
	}
	//Edition
	public long getEdition() {
		return edition;
	}
	public void setEdition(int Edition) {
		this.edition=Edition;
	}
	//NoOfCopies
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(byte NoOfCopies) {
		this.noOfCopies=NoOfCopies;
	}
	//Journal
	public String getJournal() {
		return journal;
	}
	public void setJournal(String Journal) {
		this.journal=Journal;
	}
	//status
	/*public String getStatus() {
		return Status;
	}*/
	public Library(String BookName,int BookId,String AuthorName,long Edition,int NoOfCopies,String Journal) {
		this.bookName=BookName; 
		this.bookId=BookId;// currentobj(obj.BookName=BookName)
		this.authorName=AuthorName;
		this.edition=Edition;
		this.noOfCopies=NoOfCopies;
		this.journal=Journal;

		//this.Status=Status;
	}

	public String toString() {
		return bookId + "   "+ bookName +"   "+ authorName +"   "+edition+"   "+journal+"   "+noOfCopies; 
	}

    public void addBook(Scanner scan) {
    	
		System.out.print("Enter the Book Name");
		String BookName=scan.next();

		System.out.print("Enter the BookId");
		int BookId=scan.nextInt();

		System.out.print("Enter the Author Name");
		String AuthorName=scan.next();

		System.out.print("Enter the Edition");
		int Edition=scan.nextInt();

		System.out.print("Enter the Number Of copies");
		int NoOfCopies=scan.nextInt();

		System.out.print("Enter the Journal");
		String Journal=scan.next();

		((List<Library>) Librarylist).add(new Library(BookName,BookId,AuthorName,Edition,NoOfCopies,Journal));
	}

	public void displayBooks(){
		for(Library value: Librarylist) 
			System.out.println(value);
	}

	public void search(Scanner scan) {

		boolean flag=false;
		System.out.println("Enter the BookID you want to search");
		int BookId1=scan.nextInt();
		Iterator<Library> obj1=Librarylist.iterator();
		while(obj1.hasNext()) {
			Library obj = obj1.next();
			if(obj.getBookId()==BookId1) {
				flag=true;
				System.out.println("Book found");
				break;
			}
			if(flag==false) {
				System.out.println("Book not Found");
			}
		}

		}
	 public void update(Scanner scan) {         //To Update --> Created a obj--> to getbook --> used iterator -->methods--> hasNext() and next()-->to check condition here we used boolean-->flag true-->It'll getbook--> used set method to call constructor-->flag false-->It will show nt found

			System.out.println("Enter the BookId to which you need to update");
			int BookId2=scan.nextInt();
			Iterator<Library> obj2=Librarylist.iterator();
			int ctr=-1;
			while(obj2.hasNext()) {
				ctr++;
				Library obj = obj2.next();
				boolean flag1 = true;
				if(obj.getBookId() == BookId2) {
					flag1=true;
					System.out.println("Book Found");
					System.out.print("Enter the updated number of copies");
					int NoOfCopies1=scan.nextInt();
					System.out.print("Enter the BookId");
					int BookID=scan.nextInt();
					System.out.print("Enter the BookName");
					String BookName1=scan.next();
					System.out.print("Enter the Authorname");
					String AuthorName1=scan.next();
					System.out.print("Enter the Edition");
					long Edition1=scan.nextLong();
					System.out.print("Enter the Journal");
					String Journal1=scan.next();

					Librarylist.set(ctr,new Library(BookName1,BookID,AuthorName1,Edition1,NoOfCopies1,Journal1));
					break;
				}
				if(flag1==false) {
					System.out.println("BookId not found");
				}
			}

		}

	}





