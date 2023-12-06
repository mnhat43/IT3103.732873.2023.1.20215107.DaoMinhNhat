package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> author = new ArrayList<String>();

//	public Book(int id, String title, String category, float cost) {
//		super(id, title, category, cost);
//	}
	
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}

	public void addAuthor(String authorName) {
		int count = 0;
		for (String name : author) {
			if (name.equals(authorName)) {
				count+=1;
				break;
			}
		}
		if (count==0) {
			author.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		for (String name : author) {
			if (name.equals(authorName)) {
				author.remove(authorName);
				break;
			}
		}
	}
}