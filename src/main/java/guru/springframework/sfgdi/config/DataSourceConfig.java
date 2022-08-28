package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class DataSourceConfig {

    /*
        datasource.properties
        guru.username =superuser
        guru.password=dbPassword
        guru.jdbcurl=someUrlForDB
     */

    /*
        @Value("$guru.username") means  $guru.username

        @Value("${guru.username}") means superuser

        close the value in ${} to make it Spring EL.
     */
    @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}") String username, @Value("${guru.password}") String password, @Value("${guru.jdbcurl}") String jdbcurl) {
        return new FakeDataSource(username, password, jdbcurl);
    }
}
