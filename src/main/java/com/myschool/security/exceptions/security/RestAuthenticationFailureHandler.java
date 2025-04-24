package com.myschool.security.exceptions.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

/* Aniefiok
 *created on 5/17/2020
 *inside the package */

@Component
public class RestAuthenticationFailureHandler
  extends CustomFilterResponse
  implements AuthenticationFailureHandler {

  @Override
  public void onAuthenticationFailure(
    HttpServletRequest request,
    HttpServletResponse httpServletResponse,
    AuthenticationException ex
  )
          throws IOException {
    new CustomFilterResponse("Authentication failure", httpServletResponse, ex);
  }
}
