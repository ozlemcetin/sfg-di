package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSourceBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(FakeDataSourceBinding.class)
@Configuration
public class DataSourceConfigFromConstructor {


    /*
        @EnableConfigurationProperties(FakeDataSourceBinding.class)
        this will be brought in as a Spring component
     */
}
