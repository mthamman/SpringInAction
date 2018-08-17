package soundsystem_wiringusingxmlconfig;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/soundsystem.xml"})
public class CDPlayerTest {

	@Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired
	private MediaPlayer player;

	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		assertTrue(log.getLog().contains("Playing Sgt. Peppers Lonely Hearts Club Band by The Beatles"));
		assertTrue(log.getLog().contains("-Track: Sgt. Peppers Lonely Hearts Club Band"));
		assertTrue(log.getLog().contains("-Track: With a Little Help from My Friends"));
		assertTrue(log.getLog().contains("-Track: Lucy in the Sky with Diamonds"));
		assertTrue(log.getLog().contains("-Track: Getting Better"));
		assertTrue(log.getLog().contains("-Track: Fixing a Hole"));
	}
}