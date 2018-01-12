package cn.et;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class config {

	@Value("${driverClass}")
	private String driverClass;
	@Value("${password}")
	private String password;
	@Value("${url}")
	private String url;
	@Value("${username}")
	private String username;
	
	@Bean
	public DataSource myDataSource(){
		DruidDataSource dds = new DruidDataSource();
		dds.setUrl(url);
		dds.setDriverClassName(driverClass);
		dds.setUsername(username);
		dds.setPassword(password);
		return dds;
	}
	
}
