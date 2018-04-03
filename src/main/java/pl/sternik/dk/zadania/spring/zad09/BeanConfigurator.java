package pl.sternik.dk.zadania.spring.zad09;

        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.Lazy;

        import pl.sternik.dk.zadania.spring.zad01.MyFirstBean;
        import pl.sternik.dk.zadania.spring.zad02.MySecondBean;
        import pl.sternik.dk.zadania.spring.zad03.MyThirdBean;

@Configuration
public class BeanConfigurator {


    @Bean
    @Lazy
    public MySecondBean myDrugi() {

        return new MySecondBean("aaa");
    }

    @Bean
    public MySecondBean myDrugiNazwany() {
        MySecondBean t = new MySecondBean();
        t.setName("Tralal ala");
        return t;
    }


    @Bean
    @Lazy
    public MyFirstBean getMyFirst() {

        return new MyFirstBean("aaapierwszy");
    }

    @Bean
    public MyFirstBean getMyFirstNzawany() {
        MyFirstBean t = new MyFirstBean();
        t.setName("Tralal alajeden");
        return t;
    }


    public MyThirdBean mySkomplikowany() {
        return new MyThirdBean("skomplikowany");
    }
}