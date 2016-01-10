
import java.util.Scanner;


public class library {
	static Book[] BooksVec;
  	static int TotalBooks, HebBooks, OtherBooks; 
  	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalBooks = HebBooks = OtherBooks = 0;
        BooksVec = new Book[100];
		choice();
		  
	}

	

	private static void choice() {
		// TODO Auto-generated method stub

		int i = 0;
		
		System.out.println("please insert number");
		System.out.println("1 to insert book");
		System.out.println("2 to update book");
		System.out.println("3 to delete book");
		System.out.println("4 to find book");
		System.out.println("5 to print to all books by type");
		System.out.println("6 to statistics book");
		System.out.println("7 to insert book"); 
		
		Scanner sc = new Scanner(System.in) ;
		i = sc.nextInt();
		
		switch (i) {
		case 1: insertBook();
			break;
		case 2: updateBook();
			break;
		case 3: deleteBook();
			break;
		case 4: findBook();
			break;
		case 5: printBook();
			break;
		case 6: statistics();
			break;
		default:
			break;
		}
	}

	private static void statistics() {
		// TODO Auto-generated method stub

		System.out.println("im choose 6");
		choice();
	}



	private static void printBook() {
		// TODO Auto-generated method stub

		System.out.println("im choose 5");
		choice();
	}



	private static void findBook() {
		// TODO Auto-generated method stub

		System.out.println("im choose 4");
		choice();
	}



	private static void deleteBook() {
	System.out.println("im choose 3");
	Scanner in = new Scanner(System.in);
	System.out.println("please enter the Book number You want to delete from 0-100  ");
	int delete =0 ;
	delete=in.nextInt(); 
	if (BooksVec[delete] == BooksVec[TotalBooks] )
	{
		BooksVec[delete] = BooksVec[TotalBooks];
	}
	else
	{
		BooksVec[delete] = BooksVec[TotalBooks];
	}
	choice();
	}



	private static void updateBook() {
	System.out.println("You choose 2");
	
		
		
		
		choice();
	}



	public static void insertBook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BooksVec[TotalBooks]= new Book();
		
		System.out.println("please enter the Book name  " );
		BooksVec[TotalBooks].nameBook= sc.next();
		
		System.out.println("please enter the author_Fname  " );
		BooksVec[TotalBooks]. fname= sc.next();
		
		System.out.println("please enter the author_Lname  " );
		BooksVec[TotalBooks]. lname= sc.next();
		
		System.out.println("please enter the Year of Publication " );
		BooksVec[TotalBooks]. YOfPublic = sc.nextInt();
		
		
		System.out.println("please enter the number of Edition " );
		BooksVec[TotalBooks]. edition = sc.nextInt();
		
		
		System.out.println("please enter if  Israeli Book pressure-1 or other pressure-2 " );
		BooksVec[TotalBooks].TypBook = sc.nextInt();
		//choice();
		TotalBooks++;
		
	}
  public class Book {
		String nameBook;
		int edition;
		String fname;
		String lname;
		int YOfPublic;
		String country;
		int TypBook;
		

	}
	

}
