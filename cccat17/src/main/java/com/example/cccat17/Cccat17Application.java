package com.example.cccat17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.cccat17.domain")
//@EnableJpaRepositories("com.example.cccat17.repository")
public class Cccat17Application extends ValidacaoCpfUsuario{


	public static void main(String[] args) {
		SpringApplication.run(Cccat17Application.class, args);
	}

}
