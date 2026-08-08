package org.ict.demogitproject;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
  @GetMapping("/")
  public String index() {
    System.out.println("Hello World!");
    return "Hello World!";
  }
}
