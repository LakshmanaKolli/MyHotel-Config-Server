package myhotel.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyHotelConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHotelConfigServerApplication.class, args);
	}

}
