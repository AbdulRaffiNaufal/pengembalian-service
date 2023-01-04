package com.naufal.pengembalian;

import java.text.SimpleDateFormat;
import org.hibernate.annotations.Loader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PengembalianServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PengembalianServiceApplication.class, args);
	}
        
        @Bean
        public RestTemplate restTemplate() {
        return new RestTemplate();
    }
        
        @Bean
        public SimpleDateFormat simpleDateFormat() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

}
