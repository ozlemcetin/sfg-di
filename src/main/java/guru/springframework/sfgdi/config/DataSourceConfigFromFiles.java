package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@PropertySource("classpath:datasource.properties")
@Configuration
public class DataSourceConfigFromFiles {

    /*
        @PropertySource("classpath:datasource.properties")

        guru.username =superuser
        guru.password=dbPassword
        guru.jdbcurl=someUrlForDB
     */

    /*
        @Value("$guru.username") means  $guru.username

        @Value("${guru.username}") means superuser

        close the value in ${} to make it Spring EL.
     */

    /*
        To overwrite the property values in .properties files :

        Edit Configurtaions > Environment variables: > GURU_USERNAME=UserFromEnvVar!
        getUsername : UserFromEnvVar!
     */

    /*
       Edit Configurtaions > Program arguments: > --guru.password=PwdFromCmdLine --guru.username=UserFromCmdLine
       getUsername : UserFromCmdLine
       getPassword : PwdFromCmdLine
    */
    @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}") String username, @Value("${guru.password}") String password, @Value("${guru.jdbcurl}") String jdbcurl) {
        return new FakeDataSource(username, password, jdbcurl);
    }
}
