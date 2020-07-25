package com.wlfei.uticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author wlfei
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Application {
	public static void main(String[] args) {
		// System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ  uticket工单系统启动成功!  ლ(´ڡ`ლ)ﾞ ");
	}
}
