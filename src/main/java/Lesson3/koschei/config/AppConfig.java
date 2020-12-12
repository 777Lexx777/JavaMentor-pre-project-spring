package Lesson3.koschei.config;

import Lesson3.koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Lesson3.koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg6(Needle7 needle ) { return new Egg6(needle ); }

    @Bean
    public static Needle7 getNeedle7(Death8 death ) { return new Needle7(death); }

    @Bean
    public static Death8 getDeath8() { return new Death8();}
}
