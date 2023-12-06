package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
//	
//	public String toString() {
//		String res = String.format("%d. DVD - %s - %s - %s - %d : %f $", this.id, this.title, this.category,
//				this.director, this.length, this.cost);
//		return res;
//	}
//
//	public boolean isMatch(String title) {
//		return title.equals(this.title);
//	}
//
//	public boolean isMatch(int id) {
//		return id == this.id;
//	}
//


}
