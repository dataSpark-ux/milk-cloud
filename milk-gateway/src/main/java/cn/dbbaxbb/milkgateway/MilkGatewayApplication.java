package cn.dbbaxbb.milkgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * 网关应用
 * @author wangyi
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class MilkGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MilkGatewayApplication.class, args);
    }

}
