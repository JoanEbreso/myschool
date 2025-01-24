package com.myschool.security.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig{

    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .authorizeRequests().requestMatchers("/api/v*/user_registration/**")
                .permitAll()
                .anyRequest()
                .authenticated().and()
                .formLogin();
    }

}
