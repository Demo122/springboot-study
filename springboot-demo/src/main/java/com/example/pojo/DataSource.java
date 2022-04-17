package com.example.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @discription: DataSource
 * Created by mingli on 2022/4/17 16:42.
 */

@Component
@ConfigurationProperties(prefix = "datasource")
public class DataSource {
    /**
     * driver-class-name: com.mysql.cj.jdbc.Driver
     *   url: jdbc:mysql://localhost:3306/ssm_db?serverTimezone=UTC
     *   username: root
     *   password: root
     */
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "DataSource{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
