package cn.dbbaxbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangyi
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MilkAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MilkAuthServerApplication.class, args);
    }

}
