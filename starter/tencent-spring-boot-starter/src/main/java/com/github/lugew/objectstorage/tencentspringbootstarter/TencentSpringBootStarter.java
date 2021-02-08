package com.github.lugew.objectstorage.tencentspringbootstarter;

import com.lugew.winsin.web.configuration.EnableStandardResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 夏露桂
 * @since 2021/2/8 12:04
 */
@SpringBootApplication
@EnableStandardResponse
public class TencentSpringBootStarter {
    public static void main(String[] args) {
        SpringApplication.run(TencentSpringBootStarter.class, args);
    }
}
