package guru.springframework.sfgdi.datasource;

public class FakeDataSource {

    private final String username;
    private final String password;
    private final String jdbcurl;


    public FakeDataSource(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
