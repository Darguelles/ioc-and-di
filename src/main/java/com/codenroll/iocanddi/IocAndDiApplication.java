package com.codenroll.iocanddi;

import com.codenroll.iocanddi.service.injectors.ApplePieServiceInjector;
import com.codenroll.iocanddi.service.injectors.LemonPieServiceInjector;
import com.codenroll.iocanddi.service.injectors.PieServiceInjector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocAndDiApplication {

	public static void main(String[] args) {
		PieServiceInjector appleServiceInjector = new ApplePieServiceInjector();
		PieServiceInjector lemonServiceInjector = new LemonPieServiceInjector();
		appleServiceInjector.getService().prepare();
		lemonServiceInjector.getService().prepare();
		SpringApplication.run(IocAndDiApplication.class, args);
	}

}
