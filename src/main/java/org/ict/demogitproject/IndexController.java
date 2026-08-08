package org.ict.demogitproject;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
  @GetMapping("/")
  public String index() {
    System.out.println("Hello World!");
    System.out.println("Hello World2");
    return "Hello World!";
  }
}
