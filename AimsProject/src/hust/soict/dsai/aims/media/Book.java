package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	public ArrayList<String> getAuthors() {
		return authors;
	}

	public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}

	public Book(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Author: " + authorName + " has been added");
		}else {
				System.out.println("Author: " + authorName+" already exist");
			}
		}
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Author: " + authorName + "has been removed from array");
		} else {
			System.out.println("Author:" +authorName + "is not exist");
		}
	}
	@Override
	public String toString() {
		return super.toString() + "Author: " + getAuthors();
	}
	
}
