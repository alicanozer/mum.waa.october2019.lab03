package mum.waa.october2019.lab03.config;

import mum.waa.october2019.lab03.validator.Validator;
import mum.waa.october2019.lab03.validator.ValidatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("mum.waa.october2019.lab03")
public class RootApplicationContextConfig {

    @Bean
    public Validator validator() {
      return new ValidatorImpl();
    }


}
