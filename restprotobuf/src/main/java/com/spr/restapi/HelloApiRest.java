package com.spr.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spr.restapi.driverapp.ProtobufRideShareApp.Customer;

@RestController
public class HelloApiRest {

  @GetMapping("/api/hello")
  ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello");
  }
  
  @PostMapping("/api/customer-proto")
  ResponseEntity<Customer> customerProto(@RequestBody Customer customer) {
    return ResponseEntity.ok(customer);
  }
}
