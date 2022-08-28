package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSourceConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(FakeDataSourceConstructorBinding.class)
@Configuration
public class DataSourceConfigFromBinding {


    /*
        @EnableConfigurationProperties(FakeDataSourceBinding.class)
        this will be brought in as a Spring component
     */
}
