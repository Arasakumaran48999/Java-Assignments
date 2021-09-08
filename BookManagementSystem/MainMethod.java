package com.src;

import java.util.List;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");
		Book bok = new BookApplication();
		int ch = 0;
		do {
			System.out.println("1.AddBooks");
			System.out.println("2.Get Books");
			System.out.println("3.All Book Details");
			System.out.println("4.Delete Book");
			System.out.println("5.Update Book");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
			{
				System.out.println("Enter the book id,name,author's name,genre and cost");
				Book b = new Book();
				b.setBid(sc.nextInt());
				b.setName(sc.next());
				b.setBauthor(sc.next());
				b.setBgenre(sc.next());
				b.setBcost(sc.nextInt());
				bok.insertBooks(b);
				System.out.println("Inserted sucessfully");
				break;
			}
			case 2:
			{
				System.out.println("Enter the book id");
				int id = sc.nextInt();
				Book m = bok.selectBook(id);
				System.out.println(m.getBid() + " | " + m.getName() + " | " + m.getBauthor() + " | "
						+ m.getBgenre() + " | " + m.getBcost());
				break;
			}
			case 3:
				List<Book> b3 = b1.SelectAllBook();
				for (Book books : b3) {
					System.out.println(books);
				}
				break;
			case 4:
			{
				System.out.println("Enter the book id");
				int id1 = sc.nextInt();
				boolean res = b1.deleteBook(id1);
				if (res) {
					System.out.println("Deleted Sucessfully");
				} else {
					System.out.println("The ID is not present");
				}
				break;
			}
			case 5:
			{

				boolean res1 = false;
				Book b4 = new Book();
				System.out.println("Enter the id for updating");
				int id6 = sc.nextInt();

				System.out.println("Enter the name of book");
				b4.setBid(id6);
				b4.setName(sc.next());
				b4.setBauthor(sc.next());
				b4.setBgenre(sc.next());
				b4.setBcost(sc.nextInt());
				res1 = b1.updateBook(b4);

				if (res1) {
					System.out.println("Updates Sucessfully");
				} else {
					System.out.println("Book IDs doesn't Exist");
				}
				break;
			}
			case 6:
				System.out.println("Goodbyee");
				break;
			default:
				System.out.println("Enter a correct option");
				break;
			}

		} while (ch != 6);

	}

}
