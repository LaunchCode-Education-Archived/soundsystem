package soundsystem;

/**
 * Created by LaunchCode
 */
public class Main {

    // An example that does not use DI, and is thus tightly-coupled
    public static void main(String[] args) {
        CompactDisc cd = new SgtPeppers();
        MediaPlayer player = new CdPlayer(cd);
        player.play();
    }
}
