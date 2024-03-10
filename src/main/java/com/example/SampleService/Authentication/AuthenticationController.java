package com.example.SampleService.auth;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RequiredArgsConstructor //Note 1:
@RequestMapping("/api/v1/auth")  //Note 2:
@RestController
public class AuthenticationController {

  private final AuthenticationService service;

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.register(request));
  }
  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(
      @RequestBody AuthenticationRequest request
  ) {
    return ResponseEntity.ok(service.authenticate(request));
  }

  @PostMapping("/refresh-token")
  public void refreshToken(
      HttpServletRequest request,
      HttpServletResponse response
  ) throws IOException {
    service.refreshToken(request, response);
  }


}

/*
Note 1:

@RequiredArgsConstructor:
@RequiredArgsConstructor will generate a constructor for only required fields which have @NotNull or final annotation.
A good way to wire dependencies in Spring using constructor-based Dependency Injection.

With Lombok, it’s possible to generate a constructor for either all class’s fields (with @AllArgsConstructor) or
all final class’s fields (with @RequiredArgsConstructor). Moreover, if you still need an empty constructor,
you can append an additional @NoArgsConstructor annotation.

@Component
public class GreetingService {

    @Autowired
    private Translator translator;

    public String produce() {
        return translator.translate("hello");
    }
}
@Component
public class FarewellService {

    private final Translator translator;

    public FarewellService(Translator translator) {
        this.translator = translator;
    }

    public String produce() {
        return translator.translate("bye");
    }
}
Copy
Basically, both of the components do the same thing

 */

/*
Note 2:

used to map web requests onto specific handler classes and/or handler methods.
 */