package cn.yh.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@PropertySource(value = { "classpath:env.properties" })
@ComponentScan(basePackages = "cn.yh.study")
public class TaotaoApplication  {
//	extends SpringBootServletInitializer
//	@Override
//	protected SpringApplicationBuilder configure(
//			SpringApplicationBuilder builder) {
//		return builder.sources(TaotaoApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(TaotaoApplication.class, args);
	}
}
