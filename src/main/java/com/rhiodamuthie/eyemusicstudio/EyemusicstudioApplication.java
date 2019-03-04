package com.rhiodamuthie.eyemusicstudio;

//import com.rhiodamuthie.eyemusicstudio.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.rhiodamuthie.eyemusicstudio")
//@EnableJpaRepositories(basePackages ="com.rhiodamuthie.eyemusicstudio.repository")
public class EyemusicstudioApplication {

//    @Autowired
//    private static Runner runner;

    public static void main(String[] args) {
        SpringApplication.run(EyemusicstudioApplication.class, args);


//        runner.start();

    }

}
