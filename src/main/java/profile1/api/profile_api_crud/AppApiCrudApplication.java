package app1.api.app_api_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppApiCrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppApiCrudApplication.class, args);
	}
}
