package com.dataway;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mqz
 */
@EnableHasor()
@EnableHasorWeb()
@SpringBootApplication(scanBasePackages = { "com.dataway.hasor" })
public class ADatawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ADatawayApplication.class, args);
    }

}
