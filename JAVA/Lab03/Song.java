import java.util.Arrays;

public class Song {

	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	public Song () {
		
	}
	public Song(String title, String artist,String album,String[] composer,int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		System.out.println("title : "+this.title);
		System.out.println("artist : "+this.artist);
		System.out.println("album : "+this.album);
		System.out.println("composer : "+Arrays.toString(this.composer));
		System.out.println("year : "+this.year);
		System.out.println("track : "+this.track);
	}

}
