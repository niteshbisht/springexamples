package com.spr.restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

@Configuration
public class AppProtoConfig {

  @Bean
  ProtobufHttpMessageConverter protobufHttpMessageConverter() {
    return new ProtobufHttpMessageConverter();
  }
}
