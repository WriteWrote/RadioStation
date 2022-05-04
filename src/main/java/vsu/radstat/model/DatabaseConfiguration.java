package vsu.radstat.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = {"vsu.radstat.model.entity"})
@EnableJpaRepositories(basePackages = "vsu.radstat.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {
}
