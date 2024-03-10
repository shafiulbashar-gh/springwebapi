package com.example.SampleService.Config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@ConfigurationProperties(prefix = "credentials")
@NoArgsConstructor
@AllArgsConstructor
@Data //ref: https://www.baeldung.com/intro-to-project-lombok
public class ApplicationConfigurations {

    private String UserId;
    private String Password;


}
