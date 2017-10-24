package cn.yh.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.yh.study")
public class YhApplication {
	// extends SpringBootServletInitializer
	// @Override
	// protected SpringApplicationBuilder configure(
	// SpringApplicationBuilder builder) {
	// return builder.sources(TaotaoApplication.class);
	// }

	public static void main(String[] args) {
		SpringApplication.run(YhApplication.class, args);
	}
}
