import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHelloWorldOne = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorldTwo = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        System.out.println(beanHelloWorldTwo.equals(beanHelloWorldOne));
        System.out.println(beanCat1.equals(beanCat2));

    }
}