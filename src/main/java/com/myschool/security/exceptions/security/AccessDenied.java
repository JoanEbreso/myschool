package com.myschool.security.exceptions.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class AccessDenied extends CustomFilterResponse implements AccessDeniedHandler {

  @Override
  public void handle(
    HttpServletRequest httpServletRequest,
    HttpServletResponse httpServletResponse,
    AccessDeniedException e
  )
          throws IOException {
    new CustomFilterResponse("unauthorized api access", httpServletResponse, e);
  }
}
