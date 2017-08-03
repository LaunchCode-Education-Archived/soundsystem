package soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by LaunchCode
 */
public class MainDI {

    public static void main(String[] args) {

        // Create a Spring container using CdPlayerConfig
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(CdPlayerConfig.class);

        // Get the managed bean
        MediaPlayer player = context.getBean(MediaPlayer.class);

        // Can also get the bean by name, but then we have to cast
        // MediaPlayer player = (CdPlayer) context.getBean("player");

        player.play();
    }
}
