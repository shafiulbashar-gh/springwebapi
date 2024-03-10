package com.example.SampleService;

import com.example.SampleService.auth.AuthenticationService;
import com.example.SampleService.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static com.example.SampleService.user.Role.ADMIN;
import static com.example.SampleService.user.Role.MANAGER;


@SpringBootApplication
//@EnableJpaAuditing(auditorAwareRef = "auditorAware")

public class SampleServiceApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SampleServiceApplication.class, args);
    }
  /*


    @Bean
    public CommandLineRunner commandLineRunner(
            AuthenticationService service
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());

            var manager = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("manager@mail.com")
                    .password("password")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: " + service.register(manager).getAccessToken());

        };
    }


   */
}

