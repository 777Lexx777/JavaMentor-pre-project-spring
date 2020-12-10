package app.config;

import app.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name="dog")
 //   @Scope("prototype")
    public Dog getDog() {
        return new Dog();
    }

    @Bean(name="timer")
    @Scope("singleton")
    public Timer getTimer() {
        return new Timer();
    }
}
