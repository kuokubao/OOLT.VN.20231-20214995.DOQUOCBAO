package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Media{
	private static int nbBooks = 0;
	public int getLenght() {
		return length;
	}
	public void setLenght(int length) {
		this.length = length;
	}
	
	public List<String> getAuthorList() {
		return authorList;
	}
	public void setAuthorList(List<String> authorList) {
		this.authorList = authorList;
	}

	public List<String> authorList = new ArrayList<String>();
	
	public Book( String title, String category, float cost, List<String> authorList) {
        this.setId(nbBooks++);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.authorList = authorList;
    }
	public Book( String title, String category, float cost) {
        this.setId(nbBooks++);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }
	public void showBooks() {
		System.out.println("Book: " + this.getTitle() + " - " + this.getCategory() + " - " + this.authorList + " - " + this.length);
	}
	
	public void addAuthor(String author) {
		if (this.authorList.contains(author)) {
			System.out.print("already existed");
			return;
		}
		authorList.add(author);
		System.out.print("added author");
	}
	public void removeAuthor(String author) {
		if (!this.authorList.contains(author)) {
			System.out.print("Not found");
			return;
		}
		authorList.remove(author);
		System.out.print("removed author");
	}
	@Override
    public String toString() {
        return String.format("Book - %s - %s - %s - %d : %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }
	public static Book createBook() {
		System.out.println("---New Book---");
		String title, category;
		float cost;
		String[] authors;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter title: ");
		title = sc.nextLine();

		System.out.print("Enter category: ");
		category = sc.nextLine();

		System.out.print("Enter author name(s): ");
		authors = sc.nextLine().split(",\\s*");

		System.out.print("Enter cost: ");
		cost = sc.nextFloat();

		Book book = new Book(title, category, cost);
		for (String author : authors) {
			book.addAuthor(author);
		}
		
		sc.close();
		return book;
	}
	
}
