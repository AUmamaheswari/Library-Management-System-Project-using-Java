package javaconcepts;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DriverClassForLib {


	public static void main(String[] args) {


		Library obj=new Library();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number from the below options");
		System.out.print("1.Add the book"+ '\n'+"2.Display all books" +'\n'+ "3.Search a book"+'\n'+"4.Update book" +'\n'+"5.Exit" );
		int choice;
		do {
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				obj.addBook(scan);
				break;
			case 2:

				obj.displayBooks();
				break;
			case 3:
				obj.search(scan);
				break;
			case 4:
				obj.update(scan);
				break;
			case 5:
				System.out.println("Thank you visiting");
				break;

			}
		}
		while(choice!=5);
	}



}


