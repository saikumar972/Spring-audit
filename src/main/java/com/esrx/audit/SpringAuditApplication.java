package com.esrx.audit;

import com.esrx.audit.audit.AuditImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.envers.repository.support.EnversRevisionRepository;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableJpaRepositories(repositoryFactoryBeanClass= EnversRevisionRepositoryFactoryBean.class)
public class SpringAuditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuditApplication.class, args);
	}
	@Bean
	public AuditorAware<String> auditorAware(){
		return new AuditImpl();
	}

}
