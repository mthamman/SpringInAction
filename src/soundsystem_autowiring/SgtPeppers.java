package soundsystem_autowiring;

import org.springframework.stereotype.Component;

//@Component("sgtPeppers")
@Component
public class SgtPeppers implements CompactDisc{

	private String title = "Sgt. Peppers Lonely Hearts Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}