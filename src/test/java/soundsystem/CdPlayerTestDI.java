package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

// An example using a different configuration than the main app for testing
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CdPlayerTestConfig.class)
public class CdPlayerTestDI {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer cdPlayer;

    @Test
    public void testCdPlayer() {
        cdPlayer.play();
        assertEquals(log.getLog(), "Playing Born to Run by Bruce Springsteen" + System.lineSeparator());
    }

}
