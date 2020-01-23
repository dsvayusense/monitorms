package com.vayusense.monitorms;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MonitormsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitormsApplication.class, args);
    }

}
