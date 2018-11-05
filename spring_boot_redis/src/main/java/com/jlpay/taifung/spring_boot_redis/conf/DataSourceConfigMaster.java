package com.jlpay.taifung.spring_boot_redis.conf;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * Created by Administrator on 2017/8/11.
 *
 * 数据源的配置
 *
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.jlpay.taifung.spring_boot_redis.repository","com.jlpay.taifung.spring_boot_redis.service.impl"},
entityManagerFactoryRef = "namemasterEntityManagerFactory")
public class DataSourceConfigMaster {




	@Bean
	@Primary
	@ConfigurationProperties("master.jdbc")
	public DataSourceProperties masterDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	@Primary
	@ConfigurationProperties("master.jdbc")
	public DataSource masterDataSource() {
		return masterDataSourceProperties().initializeDataSourceBuilder().build();
	}




    @Bean(name="namemasterEntityManagerFactory")
    @Primary
	public LocalContainerEntityManagerFactoryBean masterEntityManagerFactory(
			EntityManagerFactoryBuilder builder) {
		return builder
				.dataSource(masterDataSource())
				.packages("com.jlpay.taifung.spring_boot_redis.entity")
				.persistenceUnit("master")
				.build();
	}


}