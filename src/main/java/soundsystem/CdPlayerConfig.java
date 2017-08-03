package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by LaunchCode
 */

// Configuration using @ComponentScan will look for classes in the given
// package(s) that have the @Component annotation
@Configuration
@ComponentScan(basePackages = "soundsystem")
public class CdPlayerConfig {

    // To explicitly set up a bean, add a method returning the object
    // to be managed, with @Bean

    /*
    @Bean
    public MediaPlayer cdPlayer() {
        return new CdPlayer();
    }
    */

}