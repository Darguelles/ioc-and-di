package com.codenroll.iocanddi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocAndDiApplication {

	public static void main(String[] args) {
		ApplePie applePie = new ApplePie();
		LemonPie lemonPie = new LemonPie();
		applePie.prepare();
		lemonPie.prepare();
		SpringApplication.run(IocAndDiApplication.class, args);
	}

}
