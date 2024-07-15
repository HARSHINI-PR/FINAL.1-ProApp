package profile1.api.profile_api_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients(basePackages = "profile1.api.profile_api_crud")
public class ProfileApiCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileApiCrudApplication.class, args);
	}

}
