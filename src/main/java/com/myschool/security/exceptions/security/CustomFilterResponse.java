package com.myschool.security.exceptions.security;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.myschool.helpers.JsonObject;
import jakarta.annotation.Nonnull;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Log4j2
@NoArgsConstructor
public class CustomFilterResponse {
  private String message;

  private final JsonObject jsonObjectImpl = new JsonObject();

  public CustomFilterResponse(
    String message,
    HttpServletResponse httpServletResponse,
    Exception e
  )
          throws IOException {
    errorProperty(message, httpServletResponse, e);
  }

  private void errorProperty(
    String message,
    HttpServletResponse httpServletResponse,
    Exception e
  )
    throws IOException {
    httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    httpServletResponse.setHeader(
      "Content-type: application/json",
      "Accept: application/json"
    );

    log.error(
      "AuthenticationEntryPoint error => {} and error type {}",
      e.getLocalizedMessage(),
      e.getClass().getName()
    );
    this.message = message;
    int statusCode = httpServletResponse.getStatus();

    Map<String, Object> response = new HashMap<>();
    if (e instanceof BadCredentialsException) {
      statusCode = HttpStatus.BAD_REQUEST.value();
    } else if (e instanceof InsufficientAuthenticationException) {
      statusCode = HttpStatus.BAD_REQUEST.value();
    }
    response.put("statusCode", statusCode);
    response.put("statusMessage", this.message);
    response.put("message", e.getLocalizedMessage());
    ObjectMapper mapper = new ObjectMapper();
    log.info(
      "The error object {} unauthorized and the status is {}",
      response.values(),
      httpServletResponse.getStatus()
    );
    OutputStream out = httpServletResponse.getOutputStream();
    mapper
      .writerWithDefaultPrettyPrinter()
      .writeValue(out, jsonObjectImpl.convObjToONode(response));
    out.flush();
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(@Nonnull String message) {
    this.message = message;
  }
}
