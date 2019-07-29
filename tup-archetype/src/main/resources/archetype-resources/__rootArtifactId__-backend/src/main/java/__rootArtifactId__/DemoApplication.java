package ${groupId}.${rootArtifactId};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * jar包方式
 */
//@SpringBootApplication
//public class DemoApplication {
//
//    //启动一个项目
//    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
//    }
//
//}


/**
 * war包方式
 */
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }

    //启动一个项目
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}


