package soundsystem_wiringusingxmlconfig;

import java.util.List;

public class BlankDisc implements CompactDisc{

	private String title;
	private String artist;

	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}


class BlankDisc2 implements CompactDisc{

	private String title;
	private String artist;
	private List<String> tracks;

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for(String track: this.tracks) {
			System.out.println("-Track: " + track);
		}
	}
}