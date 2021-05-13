package com.cuijing.bank.start;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

import static java.time.ZoneId.of;
import static java.util.TimeZone.getTimeZone;

/**
 * @author CuiJIng
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class,scanBasePackages = {"com.cuijing"})
@EnableTransactionManagement
@EnableCaching(proxyTargetClass = true)
@EntityScan("com.cuijing.bank.persistence")
@EnableJpaRepositories(basePackages = {"com.cuijing.bank.persistence"})
public class BankStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankStartApplication.class, args);
    }
    @PostConstruct
    void started() {
        TimeZone.setDefault(getTimeZone(of("Asia/Shanghai")));
    }

}
