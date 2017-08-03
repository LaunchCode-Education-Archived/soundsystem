package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by LaunchCode
 */
public class CoupledCdPlayer implements MediaPlayer {

    private SgtPeppers cd;

    public CoupledCdPlayer() {
        this.cd = new SgtPeppers();
    }

    public void play() {
        cd.play();
    }

}
