package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by LaunchCode
 */
@Configuration
@ComponentScan(basePackages = "soundsystem")
public class CdPlayerTestConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new BornToRun();
    }

}
