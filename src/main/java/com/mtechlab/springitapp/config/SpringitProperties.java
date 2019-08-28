package com.mtechlab.springitapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")

public class SpringitProperties {
    private String welcome="Hello, World";

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
}
