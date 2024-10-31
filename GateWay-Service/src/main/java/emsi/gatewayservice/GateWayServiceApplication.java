package emsi.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GateWayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayServiceApplication.class, args);
        
    }

}
