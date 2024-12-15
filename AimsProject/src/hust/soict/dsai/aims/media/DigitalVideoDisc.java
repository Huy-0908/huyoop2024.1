package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	@Override
    public String toString() {
        return super.toString() + ", Director: " + getDirector() + ", Length: " + getLength();
    }
	@Override
	public void play() {
		System.out.println("Playing DVD: " + getTitle());
		System.out.println("DVD length: " + getLength());
		
	}
}