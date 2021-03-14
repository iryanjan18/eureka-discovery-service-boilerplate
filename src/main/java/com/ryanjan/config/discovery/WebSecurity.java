package com.ryanjan.config.discovery;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created on 1/6/21
 * Created by Ryan Jan Borja
 * ryanjan18@outlook.ph
 */

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .csrf().disable()
      .authorizeRequests()
      .anyRequest().authenticated()
      .and()
      .httpBasic();
  }
}
