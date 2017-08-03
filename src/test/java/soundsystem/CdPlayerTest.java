package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */

// An example of what the test would look like w/o DI
public class CdPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testCdPlayer() {
        CompactDisc cd = new BornToRun();
        MediaPlayer cdPlayer = new CdPlayer(cd);
        cdPlayer.play();
        assertEquals(log.getLog(), "Playing Born to Run by Bruce Springsteen" + System.lineSeparator());
    }
}
