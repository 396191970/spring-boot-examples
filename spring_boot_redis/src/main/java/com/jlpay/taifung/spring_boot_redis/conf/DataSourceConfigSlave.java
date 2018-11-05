package com.jlpay.taifung.spring_boot_redis.conf;
//package com.jlpay.taifung.spring_boot_redis.conf;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//
///**
// * Created by Administrator on 2017/8/11.
// *
// * 数据源的配置
// *
// */
//@Configuration
//@EnableJpaRepositories(basePackages = {"com.jlpay.taifung.spring_boot_redis.dao"},
//entityManagerFactoryRef = "slaveEntityManagerFactoryName")
//public class DataSourceConfigSlave {
//
//	@Bean
//	@ConfigurationProperties("slave.jdbc")
//	public DataSourceProperties slaveDataSourceProperties() {
//		return new DataSourceProperties();
//	}
//
//	@Bean
//	@ConfigurationProperties("slave.jdbc")
//	public DataSource slaveDataSource() {
//		return slaveDataSourceProperties().initializeDataSourceBuilder().build();
//	}
//
//
//    @Bean(name="slaveEntityManagerFactoryName")
//	public LocalContainerEntityManagerFactoryBean slaveEntityManagerFactory(
//			EntityManagerFactoryBuilder builder) {
//		return builder
//				.dataSource(slaveDataSource())
//				.packages("com.jlpay.taifung.spring_boot_redis.entity")
//				.persistenceUnit("slave")
//				.build();
//	}
//
//	public static void main(String[] args) {
//
//	}
//
//
//}