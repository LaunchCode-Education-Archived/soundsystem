package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by LaunchCode
 */
@Component
public class CdPlayer implements MediaPlayer {

    // Field injection
    @Autowired
    private CompactDisc cd;

    // @Autowired could be placed here instead for constructor injection
    public CdPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public CdPlayer() {}

    // @Autowired could be placed here instead for setter injection
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
