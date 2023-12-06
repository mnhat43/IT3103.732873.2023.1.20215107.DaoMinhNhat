package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.*;

public class TestMedia {
	public static void main(String[] args) {
		List<Media> mediae =  new ArrayList<Media>();
		Book books = new Book("Giai tich", "Gv1", 20.01f);
		Media cd = new CompactDisc("Christmas", "Music", "acb", "dec", 0, 21.1f);
		Media dvd = new DigitalVideoDisc("Lord", "Anisa", "Roana", 20, 19.2f);
		mediae.add(dvd);
		mediae.add(cd);
		mediae.add(books);
		for(Media m: mediae) {
			System.out.println(m.toString());
		}
	}
}
