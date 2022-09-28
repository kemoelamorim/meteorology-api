package workbd.meteorology.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("workbd.meteorology.api.model")
@EnableJpaRepositories("workbd.meteorology.api.repository")
public class MeteorologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeteorologyApplication.class, args);
	}

}
