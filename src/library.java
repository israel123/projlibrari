import java.awt.print.Book;
import java.util.Scanner;

import jdk.nashorn.internal.ir.BreakableNode;

public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		choice();
		 Book books = new Book() ; 
	}

	

	private static void choice() {
		// TODO Auto-generated method stub

		int i = 0;
		
		System.out.println("pls insert number");
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
		// TODO Auto-generated method stub

		System.out.println("im choose 3");
		choice();
	}



	private static void updateBook() {
		// TODO Auto-generated method stub

		System.out.println("im choose 2");
		choice();
	}



	private static void insertBook() {
		// TODO Auto-generated method stub
		int i;
		System.out.println("im choose " + i);
		choice();
	}

	

}
